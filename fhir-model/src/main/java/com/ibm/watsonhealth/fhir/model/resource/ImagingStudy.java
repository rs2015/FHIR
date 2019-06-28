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

import com.ibm.watsonhealth.fhir.model.type.Annotation;
import com.ibm.watsonhealth.fhir.model.type.BackboneElement;
import com.ibm.watsonhealth.fhir.model.type.Code;
import com.ibm.watsonhealth.fhir.model.type.CodeableConcept;
import com.ibm.watsonhealth.fhir.model.type.Coding;
import com.ibm.watsonhealth.fhir.model.type.DateTime;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Identifier;
import com.ibm.watsonhealth.fhir.model.type.ImagingStudyStatus;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.Reference;
import com.ibm.watsonhealth.fhir.model.type.String;
import com.ibm.watsonhealth.fhir.model.type.UnsignedInt;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which 
 * includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a 
 * common context. A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple 
 * series of different modalities.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class ImagingStudy extends DomainResource {
    private final List<Identifier> identifier;
    private final ImagingStudyStatus status;
    private final List<Coding> modality;
    private final Reference subject;
    private final Reference encounter;
    private final DateTime started;
    private final List<Reference> basedOn;
    private final Reference referrer;
    private final List<Reference> interpreter;
    private final List<Reference> endpoint;
    private final UnsignedInt numberOfSeries;
    private final UnsignedInt numberOfInstances;
    private final Reference procedureReference;
    private final List<CodeableConcept> procedureCode;
    private final Reference location;
    private final List<CodeableConcept> reasonCode;
    private final List<Reference> reasonReference;
    private final List<Annotation> note;
    private final String description;
    private final List<Series> series;

    private ImagingStudy(Builder builder) {
        super(builder);
        identifier = Collections.unmodifiableList(builder.identifier);
        status = ValidationSupport.requireNonNull(builder.status, "status");
        modality = Collections.unmodifiableList(builder.modality);
        subject = ValidationSupport.requireNonNull(builder.subject, "subject");
        encounter = builder.encounter;
        started = builder.started;
        basedOn = Collections.unmodifiableList(builder.basedOn);
        referrer = builder.referrer;
        interpreter = Collections.unmodifiableList(builder.interpreter);
        endpoint = Collections.unmodifiableList(builder.endpoint);
        numberOfSeries = builder.numberOfSeries;
        numberOfInstances = builder.numberOfInstances;
        procedureReference = builder.procedureReference;
        procedureCode = Collections.unmodifiableList(builder.procedureCode);
        location = builder.location;
        reasonCode = Collections.unmodifiableList(builder.reasonCode);
        reasonReference = Collections.unmodifiableList(builder.reasonReference);
        note = Collections.unmodifiableList(builder.note);
        description = builder.description;
        series = Collections.unmodifiableList(builder.series);
    }

    /**
     * <p>
     * Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Identifier}.
     */
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * <p>
     * The current state of the ImagingStudy.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link ImagingStudyStatus}.
     */
    public ImagingStudyStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 
     * 29 (value set OID 1.2.840.10008.6.1.19).
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Coding}.
     */
    public List<Coding> getModality() {
        return modality;
    }

    /**
     * <p>
     * The subject, typically a patient, of the imaging study.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getSubject() {
        return subject;
    }

    /**
     * <p>
     * The healthcare event (e.g. a patient and healthcare provider interaction) during which this ImagingStudy is made.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * <p>
     * Date and time the study started.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link DateTime}.
     */
    public DateTime getStarted() {
        return started;
    }

    /**
     * <p>
     * A list of the diagnostic requests that resulted in this imaging study being performed.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * <p>
     * The requesting/referring physician.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getReferrer() {
        return referrer;
    }

    /**
     * <p>
     * Who read the study and interpreted the images or other content.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getInterpreter() {
        return interpreter;
    }

    /**
     * <p>
     * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for 
     * information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden 
     * by a series-level endpoint with the same Endpoint.connectionType.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * Number of Series in the Study. This value given may be larger than the number of series elements this Resource 
     * contains due to resource availability, security, or other factors. This element should be present if any series 
     * elements are present.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link UnsignedInt}.
     */
    public UnsignedInt getNumberOfSeries() {
        return numberOfSeries;
    }

    /**
     * <p>
     * Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource 
     * contains due to resource availability, security, or other factors. This element should be present if any instance 
     * elements are present.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link UnsignedInt}.
     */
    public UnsignedInt getNumberOfInstances() {
        return numberOfInstances;
    }

    /**
     * <p>
     * The procedure which this ImagingStudy was part of.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getProcedureReference() {
        return procedureReference;
    }

    /**
     * <p>
     * The code for the performed procedure type.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getProcedureCode() {
        return procedureCode;
    }

    /**
     * <p>
     * The principal physical location where the ImagingStudy was performed.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getLocation() {
        return location;
    }

    /**
     * <p>
     * Description of clinical condition indicating why the ImagingStudy was requested.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * <p>
     * Indicates another resource whose existence justifies this Study.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * <p>
     * Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). 
     * Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in 
     * this element.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Annotation}.
     */
    public List<Annotation> getNote() {
        return note;
    }

    /**
     * <p>
     * The Imaging Manager description of the study. Institution-generated description or classification of the Study 
     * (component) performed.
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
     * Each study has one or more series of images or other content.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Series}.
     */
    public List<Series> getSeries() {
        return series;
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
                accept(identifier, "identifier", visitor, Identifier.class);
                accept(status, "status", visitor);
                accept(modality, "modality", visitor, Coding.class);
                accept(subject, "subject", visitor);
                accept(encounter, "encounter", visitor);
                accept(started, "started", visitor);
                accept(basedOn, "basedOn", visitor, Reference.class);
                accept(referrer, "referrer", visitor);
                accept(interpreter, "interpreter", visitor, Reference.class);
                accept(endpoint, "endpoint", visitor, Reference.class);
                accept(numberOfSeries, "numberOfSeries", visitor);
                accept(numberOfInstances, "numberOfInstances", visitor);
                accept(procedureReference, "procedureReference", visitor);
                accept(procedureCode, "procedureCode", visitor, CodeableConcept.class);
                accept(location, "location", visitor);
                accept(reasonCode, "reasonCode", visitor, CodeableConcept.class);
                accept(reasonReference, "reasonReference", visitor, Reference.class);
                accept(note, "note", visitor, Annotation.class);
                accept(description, "description", visitor);
                accept(series, "series", visitor, Series.class);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        Builder builder = new Builder(status, subject);
        builder.id = id;
        builder.meta = meta;
        builder.implicitRules = implicitRules;
        builder.language = language;
        builder.text = text;
        builder.contained.addAll(contained);
        builder.extension.addAll(extension);
        builder.modifierExtension.addAll(modifierExtension);
        builder.identifier.addAll(identifier);
        builder.modality.addAll(modality);
        builder.encounter = encounter;
        builder.started = started;
        builder.basedOn.addAll(basedOn);
        builder.referrer = referrer;
        builder.interpreter.addAll(interpreter);
        builder.endpoint.addAll(endpoint);
        builder.numberOfSeries = numberOfSeries;
        builder.numberOfInstances = numberOfInstances;
        builder.procedureReference = procedureReference;
        builder.procedureCode.addAll(procedureCode);
        builder.location = location;
        builder.reasonCode.addAll(reasonCode);
        builder.reasonReference.addAll(reasonReference);
        builder.note.addAll(note);
        builder.description = description;
        builder.series.addAll(series);
        return builder;
    }

    public static Builder builder(ImagingStudyStatus status, Reference subject) {
        return new Builder(status, subject);
    }

    public static class Builder extends DomainResource.Builder {
        // required
        private final ImagingStudyStatus status;
        private final Reference subject;

        // optional
        private List<Identifier> identifier = new ArrayList<>();
        private List<Coding> modality = new ArrayList<>();
        private Reference encounter;
        private DateTime started;
        private List<Reference> basedOn = new ArrayList<>();
        private Reference referrer;
        private List<Reference> interpreter = new ArrayList<>();
        private List<Reference> endpoint = new ArrayList<>();
        private UnsignedInt numberOfSeries;
        private UnsignedInt numberOfInstances;
        private Reference procedureReference;
        private List<CodeableConcept> procedureCode = new ArrayList<>();
        private Reference location;
        private List<CodeableConcept> reasonCode = new ArrayList<>();
        private List<Reference> reasonReference = new ArrayList<>();
        private List<Annotation> note = new ArrayList<>();
        private String description;
        private List<Series> series = new ArrayList<>();

        private Builder(ImagingStudyStatus status, Reference subject) {
            super();
            this.status = status;
            this.subject = subject;
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
         * Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.
         * </p>
         * 
         * @param identifier
         *     Identifiers for the whole study
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Identifier... identifier) {
            for (Identifier value : identifier) {
                this.identifier.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.
         * </p>
         * 
         * @param identifier
         *     Identifiers for the whole study
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Collection<Identifier> identifier) {
            this.identifier.addAll(identifier);
            return this;
        }

        /**
         * <p>
         * A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 
         * 29 (value set OID 1.2.840.10008.6.1.19).
         * </p>
         * 
         * @param modality
         *     All series modality if actual acquisition modalities
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder modality(Coding... modality) {
            for (Coding value : modality) {
                this.modality.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 
         * 29 (value set OID 1.2.840.10008.6.1.19).
         * </p>
         * 
         * @param modality
         *     All series modality if actual acquisition modalities
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder modality(Collection<Coding> modality) {
            this.modality.addAll(modality);
            return this;
        }

        /**
         * <p>
         * The healthcare event (e.g. a patient and healthcare provider interaction) during which this ImagingStudy is made.
         * </p>
         * 
         * @param encounter
         *     Encounter with which this imaging study is associated
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder encounter(Reference encounter) {
            this.encounter = encounter;
            return this;
        }

        /**
         * <p>
         * Date and time the study started.
         * </p>
         * 
         * @param started
         *     When the study was started
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder started(DateTime started) {
            this.started = started;
            return this;
        }

        /**
         * <p>
         * A list of the diagnostic requests that resulted in this imaging study being performed.
         * </p>
         * 
         * @param basedOn
         *     Request fulfilled
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder basedOn(Reference... basedOn) {
            for (Reference value : basedOn) {
                this.basedOn.add(value);
            }
            return this;
        }

        /**
         * <p>
         * A list of the diagnostic requests that resulted in this imaging study being performed.
         * </p>
         * 
         * @param basedOn
         *     Request fulfilled
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder basedOn(Collection<Reference> basedOn) {
            this.basedOn.addAll(basedOn);
            return this;
        }

        /**
         * <p>
         * The requesting/referring physician.
         * </p>
         * 
         * @param referrer
         *     Referring physician
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder referrer(Reference referrer) {
            this.referrer = referrer;
            return this;
        }

        /**
         * <p>
         * Who read the study and interpreted the images or other content.
         * </p>
         * 
         * @param interpreter
         *     Who interpreted images
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder interpreter(Reference... interpreter) {
            for (Reference value : interpreter) {
                this.interpreter.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Who read the study and interpreted the images or other content.
         * </p>
         * 
         * @param interpreter
         *     Who interpreted images
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder interpreter(Collection<Reference> interpreter) {
            this.interpreter.addAll(interpreter);
            return this;
        }

        /**
         * <p>
         * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for 
         * information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden 
         * by a series-level endpoint with the same Endpoint.connectionType.
         * </p>
         * 
         * @param endpoint
         *     Study access endpoint
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder endpoint(Reference... endpoint) {
            for (Reference value : endpoint) {
                this.endpoint.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for 
         * information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden 
         * by a series-level endpoint with the same Endpoint.connectionType.
         * </p>
         * 
         * @param endpoint
         *     Study access endpoint
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder endpoint(Collection<Reference> endpoint) {
            this.endpoint.addAll(endpoint);
            return this;
        }

        /**
         * <p>
         * Number of Series in the Study. This value given may be larger than the number of series elements this Resource 
         * contains due to resource availability, security, or other factors. This element should be present if any series 
         * elements are present.
         * </p>
         * 
         * @param numberOfSeries
         *     Number of Study Related Series
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder numberOfSeries(UnsignedInt numberOfSeries) {
            this.numberOfSeries = numberOfSeries;
            return this;
        }

        /**
         * <p>
         * Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource 
         * contains due to resource availability, security, or other factors. This element should be present if any instance 
         * elements are present.
         * </p>
         * 
         * @param numberOfInstances
         *     Number of Study Related Instances
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder numberOfInstances(UnsignedInt numberOfInstances) {
            this.numberOfInstances = numberOfInstances;
            return this;
        }

        /**
         * <p>
         * The procedure which this ImagingStudy was part of.
         * </p>
         * 
         * @param procedureReference
         *     The performed Procedure reference
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder procedureReference(Reference procedureReference) {
            this.procedureReference = procedureReference;
            return this;
        }

        /**
         * <p>
         * The code for the performed procedure type.
         * </p>
         * 
         * @param procedureCode
         *     The performed procedure code
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder procedureCode(CodeableConcept... procedureCode) {
            for (CodeableConcept value : procedureCode) {
                this.procedureCode.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The code for the performed procedure type.
         * </p>
         * 
         * @param procedureCode
         *     The performed procedure code
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder procedureCode(Collection<CodeableConcept> procedureCode) {
            this.procedureCode.addAll(procedureCode);
            return this;
        }

        /**
         * <p>
         * The principal physical location where the ImagingStudy was performed.
         * </p>
         * 
         * @param location
         *     Where ImagingStudy occurred
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder location(Reference location) {
            this.location = location;
            return this;
        }

        /**
         * <p>
         * Description of clinical condition indicating why the ImagingStudy was requested.
         * </p>
         * 
         * @param reasonCode
         *     Why the study was requested
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reasonCode(CodeableConcept... reasonCode) {
            for (CodeableConcept value : reasonCode) {
                this.reasonCode.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Description of clinical condition indicating why the ImagingStudy was requested.
         * </p>
         * 
         * @param reasonCode
         *     Why the study was requested
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reasonCode(Collection<CodeableConcept> reasonCode) {
            this.reasonCode.addAll(reasonCode);
            return this;
        }

        /**
         * <p>
         * Indicates another resource whose existence justifies this Study.
         * </p>
         * 
         * @param reasonReference
         *     Why was study performed
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reasonReference(Reference... reasonReference) {
            for (Reference value : reasonReference) {
                this.reasonReference.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Indicates another resource whose existence justifies this Study.
         * </p>
         * 
         * @param reasonReference
         *     Why was study performed
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reasonReference(Collection<Reference> reasonReference) {
            this.reasonReference.addAll(reasonReference);
            return this;
        }

        /**
         * <p>
         * Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). 
         * Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in 
         * this element.
         * </p>
         * 
         * @param note
         *     User-defined comments
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder note(Annotation... note) {
            for (Annotation value : note) {
                this.note.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). 
         * Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in 
         * this element.
         * </p>
         * 
         * @param note
         *     User-defined comments
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder note(Collection<Annotation> note) {
            this.note.addAll(note);
            return this;
        }

        /**
         * <p>
         * The Imaging Manager description of the study. Institution-generated description or classification of the Study 
         * (component) performed.
         * </p>
         * 
         * @param description
         *     Institution-generated description
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
         * Each study has one or more series of images or other content.
         * </p>
         * 
         * @param series
         *     Each study has one or more series of instances
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder series(Series... series) {
            for (Series value : series) {
                this.series.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Each study has one or more series of images or other content.
         * </p>
         * 
         * @param series
         *     Each study has one or more series of instances
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder series(Collection<Series> series) {
            this.series.addAll(series);
            return this;
        }

        @Override
        public ImagingStudy build() {
            return new ImagingStudy(this);
        }
    }

    /**
     * <p>
     * Each study has one or more series of images or other content.
     * </p>
     */
    public static class Series extends BackboneElement {
        private final Id uid;
        private final UnsignedInt number;
        private final Coding modality;
        private final String description;
        private final UnsignedInt numberOfInstances;
        private final List<Reference> endpoint;
        private final Coding bodySite;
        private final Coding laterality;
        private final List<Reference> specimen;
        private final DateTime started;
        private final List<Performer> performer;
        private final List<Instance> instance;

        private Series(Builder builder) {
            super(builder);
            uid = ValidationSupport.requireNonNull(builder.uid, "uid");
            number = builder.number;
            modality = ValidationSupport.requireNonNull(builder.modality, "modality");
            description = builder.description;
            numberOfInstances = builder.numberOfInstances;
            endpoint = Collections.unmodifiableList(builder.endpoint);
            bodySite = builder.bodySite;
            laterality = builder.laterality;
            specimen = Collections.unmodifiableList(builder.specimen);
            started = builder.started;
            performer = Collections.unmodifiableList(builder.performer);
            instance = Collections.unmodifiableList(builder.instance);
        }

        /**
         * <p>
         * The DICOM Series Instance UID for the series.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Id}.
         */
        public Id getUid() {
            return uid;
        }

        /**
         * <p>
         * The numeric identifier of this series in the study.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link UnsignedInt}.
         */
        public UnsignedInt getNumber() {
            return number;
        }

        /**
         * <p>
         * The modality of this series sequence.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Coding}.
         */
        public Coding getModality() {
            return modality;
        }

        /**
         * <p>
         * A description of the series.
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
         * Number of SOP Instances in the Study. The value given may be larger than the number of instance elements this resource 
         * contains due to resource availability, security, or other factors. This element should be present if any instance 
         * elements are present.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link UnsignedInt}.
         */
        public UnsignedInt getNumberOfInstances() {
            return numberOfInstances;
        }

        /**
         * <p>
         * The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for 
         * information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level 
         * endpoint with the same Endpoint.connectionType.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Reference}.
         */
        public List<Reference> getEndpoint() {
            return endpoint;
        }

        /**
         * <p>
         * The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.
         * org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may 
         * indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.
         * laterality.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Coding}.
         */
        public Coding getBodySite() {
            return bodySite;
        }

        /**
         * <p>
         * The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired 
         * abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Coding}.
         */
        public Coding getLaterality() {
            return laterality;
        }

        /**
         * <p>
         * The specimen imaged, e.g., for whole slide imaging of a biopsy.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Reference}.
         */
        public List<Reference> getSpecimen() {
            return specimen;
        }

        /**
         * <p>
         * The date and time the series was started.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link DateTime}.
         */
        public DateTime getStarted() {
            return started;
        }

        /**
         * <p>
         * Indicates who or what performed the series and how they were involved.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Performer}.
         */
        public List<Performer> getPerformer() {
            return performer;
        }

        /**
         * <p>
         * A single SOP instance within the series, e.g. an image, or presentation state.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Instance}.
         */
        public List<Instance> getInstance() {
            return instance;
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
                    accept(uid, "uid", visitor);
                    accept(number, "number", visitor);
                    accept(modality, "modality", visitor);
                    accept(description, "description", visitor);
                    accept(numberOfInstances, "numberOfInstances", visitor);
                    accept(endpoint, "endpoint", visitor, Reference.class);
                    accept(bodySite, "bodySite", visitor);
                    accept(laterality, "laterality", visitor);
                    accept(specimen, "specimen", visitor, Reference.class);
                    accept(started, "started", visitor);
                    accept(performer, "performer", visitor, Performer.class);
                    accept(instance, "instance", visitor, Instance.class);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(Id uid, Coding modality) {
            return new Builder(uid, modality);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final Id uid;
            private final Coding modality;

            // optional
            private UnsignedInt number;
            private String description;
            private UnsignedInt numberOfInstances;
            private List<Reference> endpoint = new ArrayList<>();
            private Coding bodySite;
            private Coding laterality;
            private List<Reference> specimen = new ArrayList<>();
            private DateTime started;
            private List<Performer> performer = new ArrayList<>();
            private List<Instance> instance = new ArrayList<>();

            private Builder(Id uid, Coding modality) {
                super();
                this.uid = uid;
                this.modality = modality;
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

            /**
             * <p>
             * The numeric identifier of this series in the study.
             * </p>
             * 
             * @param number
             *     Numeric identifier of this series
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder number(UnsignedInt number) {
                this.number = number;
                return this;
            }

            /**
             * <p>
             * A description of the series.
             * </p>
             * 
             * @param description
             *     A short human readable summary of the series
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
             * Number of SOP Instances in the Study. The value given may be larger than the number of instance elements this resource 
             * contains due to resource availability, security, or other factors. This element should be present if any instance 
             * elements are present.
             * </p>
             * 
             * @param numberOfInstances
             *     Number of Series Related Instances
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder numberOfInstances(UnsignedInt numberOfInstances) {
                this.numberOfInstances = numberOfInstances;
                return this;
            }

            /**
             * <p>
             * The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for 
             * information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level 
             * endpoint with the same Endpoint.connectionType.
             * </p>
             * 
             * @param endpoint
             *     Series access endpoint
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder endpoint(Reference... endpoint) {
                for (Reference value : endpoint) {
                    this.endpoint.add(value);
                }
                return this;
            }

            /**
             * <p>
             * The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for 
             * information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level 
             * endpoint with the same Endpoint.connectionType.
             * </p>
             * 
             * @param endpoint
             *     Series access endpoint
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder endpoint(Collection<Reference> endpoint) {
                this.endpoint.addAll(endpoint);
                return this;
            }

            /**
             * <p>
             * The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.
             * org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may 
             * indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.
             * laterality.
             * </p>
             * 
             * @param bodySite
             *     Body part examined
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder bodySite(Coding bodySite) {
                this.bodySite = bodySite;
                return this;
            }

            /**
             * <p>
             * The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired 
             * abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite.
             * </p>
             * 
             * @param laterality
             *     Body part laterality
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder laterality(Coding laterality) {
                this.laterality = laterality;
                return this;
            }

            /**
             * <p>
             * The specimen imaged, e.g., for whole slide imaging of a biopsy.
             * </p>
             * 
             * @param specimen
             *     Specimen imaged
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder specimen(Reference... specimen) {
                for (Reference value : specimen) {
                    this.specimen.add(value);
                }
                return this;
            }

            /**
             * <p>
             * The specimen imaged, e.g., for whole slide imaging of a biopsy.
             * </p>
             * 
             * @param specimen
             *     Specimen imaged
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder specimen(Collection<Reference> specimen) {
                this.specimen.addAll(specimen);
                return this;
            }

            /**
             * <p>
             * The date and time the series was started.
             * </p>
             * 
             * @param started
             *     When the series started
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder started(DateTime started) {
                this.started = started;
                return this;
            }

            /**
             * <p>
             * Indicates who or what performed the series and how they were involved.
             * </p>
             * 
             * @param performer
             *     Who performed the series
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder performer(Performer... performer) {
                for (Performer value : performer) {
                    this.performer.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Indicates who or what performed the series and how they were involved.
             * </p>
             * 
             * @param performer
             *     Who performed the series
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder performer(Collection<Performer> performer) {
                this.performer.addAll(performer);
                return this;
            }

            /**
             * <p>
             * A single SOP instance within the series, e.g. an image, or presentation state.
             * </p>
             * 
             * @param instance
             *     A single SOP instance from the series
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder instance(Instance... instance) {
                for (Instance value : instance) {
                    this.instance.add(value);
                }
                return this;
            }

            /**
             * <p>
             * A single SOP instance within the series, e.g. an image, or presentation state.
             * </p>
             * 
             * @param instance
             *     A single SOP instance from the series
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder instance(Collection<Instance> instance) {
                this.instance.addAll(instance);
                return this;
            }

            @Override
            public Series build() {
                return new Series(this);
            }

            private static Builder from(Series series) {
                Builder builder = new Builder(series.uid, series.modality);
                builder.number = series.number;
                builder.description = series.description;
                builder.numberOfInstances = series.numberOfInstances;
                builder.endpoint.addAll(series.endpoint);
                builder.bodySite = series.bodySite;
                builder.laterality = series.laterality;
                builder.specimen.addAll(series.specimen);
                builder.started = series.started;
                builder.performer.addAll(series.performer);
                builder.instance.addAll(series.instance);
                return builder;
            }
        }

        /**
         * <p>
         * Indicates who or what performed the series and how they were involved.
         * </p>
         */
        public static class Performer extends BackboneElement {
            private final CodeableConcept function;
            private final Reference actor;

            private Performer(Builder builder) {
                super(builder);
                function = builder.function;
                actor = ValidationSupport.requireNonNull(builder.actor, "actor");
            }

            /**
             * <p>
             * Distinguishes the type of involvement of the performer in the series.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link CodeableConcept}.
             */
            public CodeableConcept getFunction() {
                return function;
            }

            /**
             * <p>
             * Indicates who or what performed the series.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Reference}.
             */
            public Reference getActor() {
                return actor;
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
                        accept(function, "function", visitor);
                        accept(actor, "actor", visitor);
                    }
                    visitor.visitEnd(elementName, this);
                    visitor.postVisit(this);
                }
            }

            @Override
            public Builder toBuilder() {
                return Builder.from(this);
            }

            public static Builder builder(Reference actor) {
                return new Builder(actor);
            }

            public static class Builder extends BackboneElement.Builder {
                // required
                private final Reference actor;

                // optional
                private CodeableConcept function;

                private Builder(Reference actor) {
                    super();
                    this.actor = actor;
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

                /**
                 * <p>
                 * Distinguishes the type of involvement of the performer in the series.
                 * </p>
                 * 
                 * @param function
                 *     Type of performance
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder function(CodeableConcept function) {
                    this.function = function;
                    return this;
                }

                @Override
                public Performer build() {
                    return new Performer(this);
                }

                private static Builder from(Performer performer) {
                    Builder builder = new Builder(performer.actor);
                    builder.function = performer.function;
                    return builder;
                }
            }
        }

        /**
         * <p>
         * A single SOP instance within the series, e.g. an image, or presentation state.
         * </p>
         */
        public static class Instance extends BackboneElement {
            private final Id uid;
            private final Coding sopClass;
            private final UnsignedInt number;
            private final String title;

            private Instance(Builder builder) {
                super(builder);
                uid = ValidationSupport.requireNonNull(builder.uid, "uid");
                sopClass = ValidationSupport.requireNonNull(builder.sopClass, "sopClass");
                number = builder.number;
                title = builder.title;
            }

            /**
             * <p>
             * The DICOM SOP Instance UID for this image or other DICOM content.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Id}.
             */
            public Id getUid() {
                return uid;
            }

            /**
             * <p>
             * DICOM instance type.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link Coding}.
             */
            public Coding getSopClass() {
                return sopClass;
            }

            /**
             * <p>
             * The number of instance in the series.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link UnsignedInt}.
             */
            public UnsignedInt getNumber() {
                return number;
            }

            /**
             * <p>
             * The description of the instance.
             * </p>
             * 
             * @return
             *     An immutable object of type {@link String}.
             */
            public String getTitle() {
                return title;
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
                        accept(uid, "uid", visitor);
                        accept(sopClass, "sopClass", visitor);
                        accept(number, "number", visitor);
                        accept(title, "title", visitor);
                    }
                    visitor.visitEnd(elementName, this);
                    visitor.postVisit(this);
                }
            }

            @Override
            public Builder toBuilder() {
                return Builder.from(this);
            }

            public static Builder builder(Id uid, Coding sopClass) {
                return new Builder(uid, sopClass);
            }

            public static class Builder extends BackboneElement.Builder {
                // required
                private final Id uid;
                private final Coding sopClass;

                // optional
                private UnsignedInt number;
                private String title;

                private Builder(Id uid, Coding sopClass) {
                    super();
                    this.uid = uid;
                    this.sopClass = sopClass;
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

                /**
                 * <p>
                 * The number of instance in the series.
                 * </p>
                 * 
                 * @param number
                 *     The number of this instance in the series
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder number(UnsignedInt number) {
                    this.number = number;
                    return this;
                }

                /**
                 * <p>
                 * The description of the instance.
                 * </p>
                 * 
                 * @param title
                 *     Description of instance
                 * 
                 * @return
                 *     A reference to this Builder instance.
                 */
                public Builder title(String title) {
                    this.title = title;
                    return this;
                }

                @Override
                public Instance build() {
                    return new Instance(this);
                }

                private static Builder from(Instance instance) {
                    Builder builder = new Builder(instance.uid, instance.sopClass);
                    builder.number = instance.number;
                    builder.title = instance.title;
                    return builder;
                }
            }
        }
    }
}