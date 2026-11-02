.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$StartSyncParam;
.super Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StartSyncParam"
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;-><init>(II)V

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;->getParamData()[B

    move-result-object v0

    return-object v0
.end method
