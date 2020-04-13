package com.vestrel00.contacts.entities.cursor

import android.database.Cursor

internal fun Cursor.addressCursor() = AddressCursor(this)
internal fun Cursor.companyCursor() = CompanyCursor(this)
internal fun Cursor.contactCursor() = ContactCursor(this)
internal fun Cursor.contactsCursor() = ContactsCursor(this)
internal fun Cursor.emailCursor() = EmailCursor(this)
internal fun Cursor.eventCursor() = EventCursor(this)
internal fun Cursor.groupCursor() = GroupsCursor(this)
internal fun Cursor.groupMembershipCursor() = GroupMembershipCursor(this)
internal fun Cursor.imCursor() = ImCursor(this)
internal fun Cursor.mimeTypeCursor() = MimeTypeCursor(this)
internal fun Cursor.nameCursor() = NameCursor(this)
internal fun Cursor.nicknameCursor() = NicknameCursor(this)
internal fun Cursor.noteCursor() = NoteCursor(this)
internal fun Cursor.optionsCursor() = OptionsCursor(this)
internal fun Cursor.phoneCursor() = PhoneCursor(this)
internal fun Cursor.photoCursor() = PhotoCursor(this)
internal fun Cursor.rawContactCursor() = RawContactCursor(this)
internal fun Cursor.relationCursor() = RelationCursor(this)
internal fun Cursor.sipAddressCursor() = SipAddressCursor(this)
internal fun Cursor.websiteCursor() = WebsiteCursor(this)