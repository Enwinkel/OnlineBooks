package com.stasst.onlinebooks

import com.google.gson.annotations.SerializedName


data class OnlineBooks (

  @SerializedName("kind"       ) var kind       : String?          = null,
  @SerializedName("totalItems" ) var totalItems : Int?             = null,
  @SerializedName("items"      ) var items      : ArrayList<Items> = arrayListOf()

)