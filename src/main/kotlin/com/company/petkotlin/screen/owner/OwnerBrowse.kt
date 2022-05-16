package com.company.petkotlin.screen.owner

import io.jmix.ui.screen.*
import com.company.petkotlin.entity.Owner

@UiController("pet_Owner.browse")
@UiDescriptor("owner-browse.xml")
@LookupComponent("ownersTable")
class OwnerBrowse : StandardLookup<Owner>()