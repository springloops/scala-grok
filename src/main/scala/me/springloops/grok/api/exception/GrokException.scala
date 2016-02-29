package me.springloops.grok.api.exception

/*
 * Copyright 2016 Springloops (SungMin Oh)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */


/**
 * Created by springloops on 2016. 2. 24..
 *
 * Signals that an {@code Grok} exception of some sort has occurred.
 * This class is the general class of
 * exceptions produced by failed or interrupted Grok operations.
 *
 *
 * @param message the reason for the exception
 * @param cause the underlying Throwable that caused this exception to be thrown.
 */
case class GrokException(message: String, cause: Throwable) extends Exception(message, cause) {

  val serialVersionUID = 1l

  /**
   *
   * @param message the reason for the exception
   */
  def this(message: String) = this(message, new Throwable(message))

  /**
   *
   * @param cause the underlying Throwable that caused this exception to be thrown.
   */
  def this(cause: Throwable) = this(cause.getMessage, cause)

  def this() = this("", new Throwable)

}
