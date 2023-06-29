/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.gotsss.domain.base



/**
 * A generic class that holds a value with its loading status.
 * @param <T>
 */

sealed class AppResult<out R> {

    data class Success<out T>(val data: T) : AppResult<T>()
    data class Error(val exception: Exception,
                     val message: String? = null,
    ) : AppResult<Nothing>()
    object Loading : AppResult<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
            Loading -> "Loading"
        }
    }
}

/**
 * `true` if [AppResult] is of type [Success] & holds non-null [Success.data].
 */
val AppResult<*>.succeeded
    get() = this is AppResult.Success && data != null

fun <T> AppResult<T>.successOr(fallback: T): T {
    return (this as? AppResult.Success<T>)?.data ?: fallback
}

val <T> AppResult<T>.data: T
    get() = (this as AppResult.Success).data
