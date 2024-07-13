package fr.meteordesign.domain.common

sealed class Result<out Success, out Failure : Any> {
    data class Success<out Success>(val data: Success) : Result<Success, Nothing>()
    data class Failure<out Failure : Any>(val error: Failure) : Result<Nothing, Failure>()
}

fun <SuccessIn, SuccessOut, Failure : Any> Result<SuccessIn, Failure>.mapSuccess(
    mapper: (SuccessIn) -> Result<SuccessOut, Failure>,
): Result<SuccessOut, Failure> =
    when (this) {
        is Result.Success -> mapper(this.data)
        is Result.Failure -> this
    }

fun <Success, FailureIn : Any, FailureOut : Any> Result<Success, FailureIn>.mapFailure(
    mapper: (FailureIn) -> Result<Success, FailureOut>,
): Result<Success, FailureOut> =
    when (this) {
        is Result.Success -> this
        is Result.Failure -> mapper(this.error)
    }
