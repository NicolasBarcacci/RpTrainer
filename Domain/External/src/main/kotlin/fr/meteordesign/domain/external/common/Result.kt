package fr.meteordesign.domain.external.common

sealed class Result<out Success, out Failure : Any> {
    data class Success<out Success>(val data: Success) : Result<Success, Nothing>()
    data class Failure<out Failure : Any>(val error: Failure) : Result<Nothing, Failure>()
}
