package com.capitalone.dashboard.model;

/**
 * Enumerates the possible {@link Collector} types.
 */
public enum CollectorType {
    SCM,
    CMDB,
    Incident,
    Build,
    Artifact,
    Deployment,
    AgileTool,
    @Deprecated
    Feature,
    @Deprecated
    ScopeOwner,
    @Deprecated
    Scope,
    CodeQuality,
    Test,
    StaticSecurityScan,
    LibraryPolicy,
    ChatOps,
    Cloud,
    MendixCloud,
    Product,
    AppPerformance,
    InfraPerformance,
    Score;

    public static CollectorType fromString(String value) {
        for (CollectorType collectorType : values()) {
            if (collectorType.toString().equalsIgnoreCase(value)) {
                return collectorType;
            }
        }
        throw new IllegalArgumentException(value + " is not a CollectorType");
    }
}
