package contacts.core.util

import contacts.core.Contacts
import contacts.core.entities.Contact
import contacts.core.entities.ExistingDataEntity

/**
 * Returns the [Contact] with the [ExistingDataEntity.contactId].
 *
 * This may return null if the [Contact] no longer exists or if permissions are not granted.
 *
 * Supports profile/non-profile Contacts with native/custom data.
 *
 * ## Permissions
 *
 * The [contacts.core.ContactsPermissions.READ_PERMISSION] is required.
 *
 * ## Thread Safety
 *
 * This should be called in a background thread to avoid blocking the UI thread.
 */
// [ANDROID X] @WorkerThread (not using annotation to avoid dependency on androidx.annotation)
@JvmOverloads
fun ExistingDataEntity.contact(contacts: Contacts, cancel: () -> Boolean = { false }): Contact? =
    contacts.findContactWithId(contactId, cancel)