.class public Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private reason:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;->reason:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;->reason:I

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;->setReason(I)Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;

    return-void
.end method


# virtual methods
.method public getReason()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;->reason:I

    return v0
.end method

.method public setReason(I)Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;->reason:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NotifyPhoneNumberPlayModeResponse{reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;->reason:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
