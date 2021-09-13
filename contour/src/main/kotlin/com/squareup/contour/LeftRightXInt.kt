/*
 * Copyright 2019 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("EXPERIMENTAL_FEATURE_WARNING", "NOTHING_TO_INLINE", "unused")

package com.squareup.contour

/**
 * Represents an [Int] on the x axis that is compatible with absolute positioning, meaning that it
 * can be used in relation to the left or right edge of a view.
 */
interface LeftRightCompatibleXInt : XInt

/**
 * Represents an [Int] on the x axis that with an absolute position, meaning that it is defined in
 * relation to the left or right edge of a view.
 */
@JvmInline
value class LeftRightXInt(override val value: Int): LeftRightCompatibleXInt {
  inline operator fun plus(other: Int) = LeftRightXInt(value + other)
  inline operator fun plus(other: LeftRightCompatibleXInt) = LeftRightXInt(value + other.value)
  inline operator fun plus(other: Float) = LeftRightXFloat(value + other)
  inline operator fun plus(other: LeftRightCompatibleXFloat) = LeftRightXFloat(value + other.value)

  inline operator fun minus(other: Int) = LeftRightXInt(value - other)
  inline operator fun minus(other: LeftRightCompatibleXInt) = LeftRightXInt(value - other.value)
  inline operator fun minus(other: Float) = LeftRightXFloat(value - other)
  inline operator fun minus(other: LeftRightCompatibleXFloat) = LeftRightXFloat(value - other.value)

  inline operator fun times(other: Int) = LeftRightXInt(value * other)
  inline operator fun times(other: LeftRightCompatibleXInt) = LeftRightXInt(value * other.value)
  inline operator fun times(other: Float) = LeftRightXFloat(value * other)
  inline operator fun times(other: LeftRightCompatibleXFloat) = LeftRightXFloat(value * other.value)

  inline operator fun div(other: Int) = LeftRightXInt(value / other)
  inline operator fun div(other: LeftRightCompatibleXInt) = LeftRightXInt(value / other.value)
  inline operator fun div(other: Float) = LeftRightXFloat(value / other)
  inline operator fun div(other: LeftRightCompatibleXFloat) = LeftRightXFloat(value / other.value)

  inline operator fun compareTo(other: Int) = value.compareTo(other)
  inline operator fun compareTo(other: LeftRightCompatibleXInt) = value.compareTo(other.value)
  inline operator fun compareTo(other: Float) = value.compareTo(other)
  inline operator fun compareTo(other: LeftRightCompatibleXFloat) = value.compareTo(other.value)

  inline fun toY() = YInt(value)
  inline fun toFloat() = LeftRightXFloat(value.toFloat())
}