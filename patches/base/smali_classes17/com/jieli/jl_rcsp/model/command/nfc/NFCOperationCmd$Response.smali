.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field private final result:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;->result:I

    return-void
.end method


# virtual methods
.method public getResult()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;->result:I

    return v0
.end method
