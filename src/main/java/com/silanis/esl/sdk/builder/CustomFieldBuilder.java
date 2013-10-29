package com.silanis.esl.sdk.builder;

import com.silanis.esl.api.model.CustomField;
import com.silanis.esl.api.model.Translation;

import java.util.List;

/**
 *
 * CustomFieldBuilder is a convenient class used to create
 * account custom fields.
 */
public class CustomFieldBuilder {
    private String id;
    private String value;
    private List<Translation> translations;
    private Boolean required = Boolean.TRUE;

    /**
     * Creates a custom field builder with field id
     * @param id of custom field
     * @return a custom field builder with field id
     */
    public static CustomFieldBuilder accountCustomField(String id){
        return new CustomFieldBuilder().withId(id);
    }

    /**
     * Sets id of custom field
     * @param id of custom field
     * @return the custom field builder itself
     */
    public CustomFieldBuilder withId(String id){
        this.id = id;
        return this;
    }

    /**
     * Sets value of custom field
     * @param value of custom field
     * @return the custom field builder itself
     */
    public CustomFieldBuilder withDefaultValue(String value){
        this.value = value;
        return this;
    }

    /**
     * Sets translation of custom field
     * @param translationBuilder translation builder
     * @return the custom field builder itself
     */
    public CustomFieldBuilder withTranslation(TranslationBuilder translationBuilder){
        this.translations = translationBuilder.build();
        return this;
    }

    /**
     * Sets required indication of custom field
     * @param required indication of custom field
     * @return the custom field builder itself
     */
    public CustomFieldBuilder isRequired(Boolean required){
        this.required = required;
        return this;
    }

    /**
     * Builds the custom field
     * @return	the custom field
     */
    public CustomField build(){
        CustomField customField = new CustomField();
        customField.setId(id);
        customField.setValue(value);
        customField.setRequired(required);
        customField.setTranslations(translations);
        return customField;
    }
}
