.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$SetDefaultNfcParam;
.super Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SetDefaultNfcParam"
.end annotation


# instance fields
.field private final id:S


# direct methods
.method public constructor <init>(IS)V
    .locals 2

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v1, v0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;-><init>(II[B)V

    iput-short p2, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$SetDefaultNfcParam;->id:S

    return-void
.end method


# virtual methods
.method public getId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$SetDefaultNfcParam;->id:S

    return v0
.end method
