.class public Lcom/jieli/jl_fatfs/model/FileExtMsg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private uuid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "prj_uuid"
    .end annotation
.end field

.field private versionID:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "version_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getUuid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/model/FileExtMsg;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public getVersionID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/model/FileExtMsg;->versionID:Ljava/lang/String;

    return-object v0
.end method

.method public setUuid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_fatfs/model/FileExtMsg;->uuid:Ljava/lang/String;

    return-void
.end method

.method public setVersionID(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_fatfs/model/FileExtMsg;->versionID:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
