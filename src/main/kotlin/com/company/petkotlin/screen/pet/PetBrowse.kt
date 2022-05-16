package com.company.petkotlin.screen.pet

import com.company.petkotlin.entity.Owner
import com.company.petkotlin.entity.Pet
import com.company.petkotlin.entity.PetType
import io.jmix.ui.action.Action
import io.jmix.ui.component.EntityComboBox
import io.jmix.ui.component.Slider
import io.jmix.ui.component.TextField
import io.jmix.ui.navigation.Route
import io.jmix.ui.screen.LookupComponent
import io.jmix.ui.screen.StandardLookup
import io.jmix.ui.screen.Subscribe
import io.jmix.ui.screen.UiController
import io.jmix.ui.screen.UiDescriptor
import org.springframework.beans.factory.annotation.Autowired


@UiController("pet_Pet.browse")
@UiDescriptor("pet-browse.xml")
@LookupComponent("petsTable")
@Route(value = "pets")
class PetBrowse : StandardLookup<Pet>() {

    @Autowired
    protected var idFilterField: TextField<String>? = null

    @Autowired
    protected var ownerFilterField: EntityComboBox<Owner>? = null

    @Autowired
    protected var typeFilterFiled: EntityComboBox<PetType>? = null

    @Autowired
    protected var birthdateFilterField: Slider<*>? = null

    @Subscribe("petsTable.clearFilter")
    protected fun onpetsTableClearFilter(event: Action.ActionPerformedEvent){
        typeFilterFiled!!.value=null
        ownerFilterField!!.value=null
        idFilterField!!.value=null
        birthdateFilterField!!.value=null
    }
}