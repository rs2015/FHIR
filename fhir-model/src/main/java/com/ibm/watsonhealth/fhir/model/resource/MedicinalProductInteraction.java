/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.annotation.Generated;

import com.ibm.watsonhealth.fhir.model.type.BackboneElement;
import com.ibm.watsonhealth.fhir.model.type.Code;
import com.ibm.watsonhealth.fhir.model.type.CodeableConcept;
import com.ibm.watsonhealth.fhir.model.type.Element;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.Reference;
import com.ibm.watsonhealth.fhir.model.type.String;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * The interactions of the medicinal product with other medicinal products, or other forms of interactions.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class MedicinalProductInteraction extends DomainResource {
    private final List<Reference> subject;
    private final String description;
    private final List<Interactant> interactant;
    private final CodeableConcept type;
    private final CodeableConcept effect;
    private final CodeableConcept incidence;
    private final CodeableConcept management;

    private MedicinalProductInteraction(Builder builder) {
        super(builder);
        subject = Collections.unmodifiableList(builder.subject);
        description = builder.description;
        interactant = Collections.unmodifiableList(builder.interactant);
        type = builder.type;
        effect = builder.effect;
        incidence = builder.incidence;
        management = builder.management;
    }

    /**
     * <p>
     * The medication for which this is a described interaction.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getSubject() {
        return subject;
    }

    /**
     * <p>
     * The interaction described.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The specific medication, food or laboratory test that interacts.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Interactant}.
     */
    public List<Interactant> getInteractant() {
        return interactant;
    }

    /**
     * <p>
     * The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test interaction.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * <p>
     * The effect of the interaction, for example "reduced gastric absorption of primary medication".
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getEffect() {
        return effect;
    }

    /**
     * <p>
     * The incidence of the interaction, e.g. theoretical, observed.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getIncidence() {
        return incidence;
    }

    /**
     * <p>
     * Actions for managing the interaction.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getManagement() {
        return management;
    }

    @Override
    public void accept(java.lang.String elementName, Visitor visitor) {
        if (visitor.preVisit(this)) {
            visitor.visitStart(elementName, this);
            if (visitor.visit(elementName, this)) {
                // visit children
                accept(id, "id", visitor);
                accept(meta, "meta", visitor);
                accept(implicitRules, "implicitRules", visitor);
                accept(language, "language", visitor);
                accept(text, "text", visitor);
                accept(contained, "contained", visitor, Resource.class);
                accept(extension, "extension", visitor, Extension.class);
                accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                accept(subject, "subject", visitor, Reference.class);
                accept(description, "description", visitor);
                accept(interactant, "interactant", visitor, Interactant.class);
                accept(type, "type", visitor);
                accept(effect, "effect", visitor);
                accept(incidence, "incidence", visitor);
                accept(management, "management", visitor);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = id;
        builder.meta = meta;
        builder.implicitRules = implicitRules;
        builder.language = language;
        builder.text = text;
        builder.contained.addAll(contained);
        builder.extension.addAll(extension);
        builder.modifierExtension.addAll(modifierExtension);
        builder.subject.addAll(subject);
        builder.description = description;
        builder.interactant.addAll(interactant);
        builder.type = type;
        builder.effect = effect;
        builder.incidence = incidence;
        builder.management = management;
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends DomainResource.Builder {
        // optional
        private List<Reference> subject = new ArrayList<>();
        private String description;
        private List<Interactant> interactant = new ArrayList<>();
        private CodeableConcept type;
        private CodeableConcept effect;
        private CodeableConcept incidence;
        private CodeableConcept management;

        private Builder() {
            super();
        }

        /**
         * <p>
         * The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
         * </p>
         * 
         * @param id
         *     Logical id of this artifact
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder id(Id id) {
            return (Builder) super.id(id);
        }

        /**
         * <p>
         * The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content 
         * might not always be associated with version changes to the resource.
         * </p>
         * 
         * @param meta
         *     Metadata about the resource
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder meta(Meta meta) {
            return (Builder) super.meta(meta);
        }

        /**
         * <p>
         * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when 
         * processing the content. Often, this is a reference to an implementation guide that defines the special rules along 
         * with other profiles etc.
         * </p>
         * 
         * @param implicitRules
         *     A set of rules under which this content was created
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder implicitRules(Uri implicitRules) {
            return (Builder) super.implicitRules(implicitRules);
        }

        /**
         * <p>
         * The base language in which the resource is written.
         * </p>
         * 
         * @param language
         *     Language of the resource content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder language(Code language) {
            return (Builder) super.language(language);
        }

        /**
         * <p>
         * A human-readable narrative that contains a summary of the resource and can be used to represent the content of the 
         * resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient 
         * detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what 
         * content should be represented in the narrative to ensure clinical safety.
         * </p>
         * 
         * @param text
         *     Text summary of the resource, for human interpretation
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder text(Narrative text) {
            return (Builder) super.text(text);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Resource... contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Collection<Resource> contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Extension... modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Collection<Extension> modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * The medication for which this is a described interaction.
         * </p>
         * 
         * @param subject
         *     The medication for which this is a described interaction
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder subject(Reference... subject) {
            for (Reference value : subject) {
                this.subject.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The medication for which this is a described interaction.
         * </p>
         * 
         * @param subject
         *     The medication for which this is a described interaction
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder subject(Collection<Reference> subject) {
            this.subject.addAll(subject);
            return this;
        }

        /**
         * <p>
         * The interaction described.
         * </p>
         * 
         * @param description
         *     The interaction described
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>
         * The specific medication, food or laboratory test that interacts.
         * </p>
         * 
         * @param interactant
         *     The specific medication, food or laboratory test that interacts
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder interactant(Interactant... interactant) {
            for (Interactant value : interactant) {
                this.interactant.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The specific medication, food or laboratory test that interacts.
         * </p>
         * 
         * @param interactant
         *     The specific medication, food or laboratory test that interacts
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder interactant(Collection<Interactant> interactant) {
            this.interactant.addAll(interactant);
            return this;
        }

        /**
         * <p>
         * The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test interaction.
         * </p>
         * 
         * @param type
         *     The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test interaction
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder type(CodeableConcept type) {
            this.type = type;
            return this;
        }

        /**
         * <p>
         * The effect of the interaction, for example "reduced gastric absorption of primary medication".
         * </p>
         * 
         * @param effect
         *     The effect of the interaction, for example "reduced gastric absorption of primary medication"
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder effect(CodeableConcept effect) {
            this.effect = effect;
            return this;
        }

        /**
         * <p>
         * The incidence of the interaction, e.g. theoretical, observed.
         * </p>
         * 
         * @param incidence
         *     The incidence of the interaction, e.g. theoretical, observed
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder incidence(CodeableConcept incidence) {
            this.incidence = incidence;
            return this;
        }

        /**
         * <p>
         * Actions for managing the interaction.
         * </p>
         * 
         * @param management
         *     Actions for managing the interaction
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder management(CodeableConcept management) {
            this.management = management;
            return this;
        }

        @Override
        public MedicinalProductInteraction build() {
            return new MedicinalProductInteraction(this);
        }
    }

    /**
     * <p>
     * The specific medication, food or laboratory test that interacts.
     * </p>
     */
    public static class Interactant extends BackboneElement {
        private final Element item;

        private Interactant(Builder builder) {
            super(builder);
            item = ValidationSupport.requireChoiceElement(builder.item, "item", Reference.class, CodeableConcept.class);
        }

        /**
         * <p>
         * The specific medication, food or laboratory test that interacts.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Element}.
         */
        public Element getItem() {
            return item;
        }

        @Override
        public void accept(java.lang.String elementName, Visitor visitor) {
            if (visitor.preVisit(this)) {
                visitor.visitStart(elementName, this);
                if (visitor.visit(elementName, this)) {
                    // visit children
                    accept(id, "id", visitor);
                    accept(extension, "extension", visitor, Extension.class);
                    accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                    accept(item, "item", visitor, true);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(Element item) {
            return new Builder(item);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final Element item;

            private Builder(Element item) {
                super();
                this.item = item;
            }

            /**
             * <p>
             * Unique id for the element within a resource (for internal references). This may be any string value that does not 
             * contain spaces.
             * </p>
             * 
             * @param id
             *     Unique id for inter-element referencing
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder id(java.lang.String id) {
                return (Builder) super.id(id);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Extension... extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Collection<Extension> extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Extension... modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Collection<Extension> modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            @Override
            public Interactant build() {
                return new Interactant(this);
            }

            private static Builder from(Interactant interactant) {
                Builder builder = new Builder(interactant.item);
                return builder;
            }
        }
    }
}