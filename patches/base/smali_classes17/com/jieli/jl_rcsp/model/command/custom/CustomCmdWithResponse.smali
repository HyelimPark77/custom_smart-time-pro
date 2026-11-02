.class Lcom/jieli/jl_rcsp/model/command/custom/CustomCmdWithResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Lcom/jieli/jl_rcsp/model/parameter/CustomCommonParam;",
        "R:",
        "Lcom/jieli/jl_rcsp/model/response/CustomCommonResponse;",
        ">",
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;"
    }
.end annotation


# instance fields
.field private customResponse:Lcom/jieli/jl_rcsp/model/response/CustomCommonResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/model/parameter/CustomCommonParam;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TP;)V"
        }
    .end annotation

    const/16 v0, 0xf0

    invoke-direct {p0, v0, p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method


# virtual methods
.method public getCustomResponse()Lcom/jieli/jl_rcsp/model/response/CustomCommonResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmdWithResponse;->customResponse:Lcom/jieli/jl_rcsp/model/response/CustomCommonResponse;

    return-object v0
.end method

.method public setCustomResponse(Lcom/jieli/jl_rcsp/model/response/CustomCommonResponse;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmdWithResponse;->customResponse:Lcom/jieli/jl_rcsp/model/response/CustomCommonResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-void
.end method
