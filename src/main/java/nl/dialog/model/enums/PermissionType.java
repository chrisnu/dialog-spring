package nl.dialog.model.enums;

public enum PermissionType {
    StakeholdersShow(PermissionGroup.Stakeholders, "Show Stakeholder", "stakeholders.show"), StakeholdersUpdate(PermissionGroup.Stakeholders, "Update Stakeholder", "stakeholders.update"), StakeholdersStore(PermissionGroup.Stakeholders, "Store Stakeholder", "stakeholders.store"), StakeholdersDestroy(PermissionGroup.Stakeholders, "Delete Stakeholder", "stakeholders.destroy"),
    ResidentsShow(PermissionGroup.Residents, "Show Resident", "residents.show"), ResidentsUpdate(PermissionGroup.Residents, "Update Resident", "residents.update"), ResidentsStore(PermissionGroup.Residents, "Store Resident", "residents.store"), ResidentsDestroy(PermissionGroup.Residents, "Delete Resident", "residents.destroy"),
    IssuesShow(PermissionGroup.Issues, "Show Issue", "issues.show"), IssuesUpdate(PermissionGroup.Issues, "Update Issue", "issues.update"), IssuesStore(PermissionGroup.Issues, "Store Issue", "issues.store"), IssuesDestroy(PermissionGroup.Issues, "Delete Issue", "issues.destroy"),
    DecisionsShow(PermissionGroup.Decisions, "Show Decision", "decisions.show"), DecisionsUpdate(PermissionGroup.Decisions, "Update Decision", "decisions.update"), DecisionsStore(PermissionGroup.Decisions, "Store Decision", "decisions.store"), DecisionsDestroy(PermissionGroup.Decisions, "Delete Decision", "decisions.destroy");

    private final PermissionGroup group;
    private final String label;
    private final String valueDb;
    PermissionType(PermissionGroup group, String label, String valueDb) {
        this.group = group;
        this.label = label;
        this.valueDb = valueDb;
    }

    public PermissionGroup getGroup() {
        return group;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return valueDb;
    }
}
