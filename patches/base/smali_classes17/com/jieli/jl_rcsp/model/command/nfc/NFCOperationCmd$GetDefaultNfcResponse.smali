.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcResponse;
.super Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetDefaultNfcResponse"
.end annotation


# instance fields
.field private final id:S


# direct methods
.method public constructor <init>(IS)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;-><init>(I)V

    iput-short p2, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcResponse;->id:S

    return-void
.end method


# virtual methods
.method public getId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcResponse;->id:S

    return v0
.end method
