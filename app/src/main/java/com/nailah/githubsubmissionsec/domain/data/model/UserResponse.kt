package com.nailah.githubsubmissionsec.domain.data.network

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.nailah.githubsubmissionsec.domain.data.model.ItemsItem
import kotlinx.android.parcel.Parcelize


@Parcelize
data class UserResponse(

	@field:SerializedName("total_count")
	val totalCount: Int,

	@field:SerializedName("incomplete_results")
	val incompleteResults: Boolean,

	@field:SerializedName("items")
	val items: List<ItemsItem>
) : Parcelable


