package com.vestrel00.contacts.entities

import com.vestrel00.contacts.AbstractField
import com.vestrel00.contacts.EmptyFieldSet
import com.vestrel00.contacts.Fields

internal fun DataEntity.fields(): Set<AbstractField> = mimeType.fields()

internal fun MimeType.fields(): Set<AbstractField> = when (this) {
    MimeType.ADDRESS -> Fields.Address
    MimeType.EMAIL -> Fields.Email
    MimeType.EVENT -> Fields.Event
    MimeType.GROUP_MEMBERSHIP -> Fields.GroupMembership
    MimeType.IM -> Fields.Im
    MimeType.NAME -> Fields.Name
    MimeType.NICKNAME -> Fields.Nickname
    MimeType.NOTE -> Fields.Note
    MimeType.ORGANIZATION -> Fields.Organization
    MimeType.PHONE -> Fields.Phone
    MimeType.PHOTO -> Fields.Photo
    MimeType.RELATION -> Fields.Relation
    MimeType.SIP_ADDRESS -> Fields.SipAddress
    MimeType.WEBSITE -> Fields.Website
    MimeType.UNKNOWN -> EmptyFieldSet
}.fields