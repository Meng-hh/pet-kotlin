package com.company.petkotlin.screen.pettype

import com.company.petkotlin.entity.PetType
import io.jmix.ui.UiComponents
import io.jmix.ui.component.ColorPicker
import io.jmix.ui.component.Component
import io.jmix.ui.navigation.Route
import io.jmix.ui.screen.*
import org.springframework.beans.factory.annotation.Autowired


@UiController("pet_PetType.browse")
@UiDescriptor("pet-type-browse.xml")
@LookupComponent("table")
@Route(value = "pettypes")
class PetTypeBrowse : MasterDetailScreen<PetType>() {
    @Autowired
    private lateinit var uiComponents: UiComponents

    @Subscribe
    private fun onInitEntity(event: InitEntityEvent<PetType>) {
        event!!.entity.color = ColorGeneration.randomColor()
    }

    @Install(to = "table.color", subject = "columnGenerator")
    protected fun tableColorColumnGenerator(petType: PetType): Component? {
        if (petType!!.color != null)
            return colorPicker(petType!!.color)
        return null
    }

    private fun colorPicker(color: String?): Component {
        //kotlin调用字节码方式
        var component: ColorPicker? = uiComponents.create(ColorPicker::class.java)
        component!!.value = color
        component.isEditable = false
        return component
    }


}