.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcParam;
.super Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetDefaultNfcParam"
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;-><init>(II[B)V

    return-void
.end method
