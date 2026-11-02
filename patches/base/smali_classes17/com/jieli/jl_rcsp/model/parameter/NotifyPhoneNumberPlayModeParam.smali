.class public Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private mode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;->setMode(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;

    return-void
.end method


# virtual methods
.method public getMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;->mode:I

    return v0
.end method

.method public getParamData()[B
    .locals 3

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;->mode:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public setMode(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;->mode:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NotifyPhoneNumberPlayModeParam{mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/NotifyPhoneNumberPlayModeParam;->mode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
