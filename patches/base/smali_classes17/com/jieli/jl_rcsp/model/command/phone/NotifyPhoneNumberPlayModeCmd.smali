.class public Lcom/jieli/jl_rcsp/model/command/phone/NotifyPhoneNumberPlayModeCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;",
        "Lcom/jieli/jl_rcsp/model/response/NotifyPhoneNumberPlayModeResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/phone/NotifyPhoneNumberPlayModeCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf1

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
