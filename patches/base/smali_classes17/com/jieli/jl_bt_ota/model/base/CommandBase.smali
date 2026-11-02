.class public Lcom/jieli/jl_bt_ota/model/base/CommandBase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
        "R:",
        "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final FLAG_HAVE_PARAMETER_AND_RESPONSE:I = 0x2

.field public static final FLAG_HAVE_PARAMETER_NO_RESPONSE:I = 0x1

.field public static final FLAG_NO_PARAMETER_AND_RESPONSE:I = 0x0

.field public static final FLAG_NO_PARAMETER_HAVE_RESPONSE:I = 0x3


# instance fields
.field private OpCodeSn:I

.field private final name:Ljava/lang/String;

.field private final opCode:I

.field private param:Lcom/jieli/jl_bt_ota/model/base/BaseParameter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field private response:Lcom/jieli/jl_bt_ota/model/base/CommonResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field private status:I

.field private final type:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;-><init>(ILjava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->opCode:I

    .line 4
    iput-object p2, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->name:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->type:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    iget v2, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->OpCodeSn:I

    iget v3, p1, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->OpCodeSn:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->opCode:I

    iget p1, p1, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->opCode:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->opCode:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOpCodeSn()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->OpCodeSn:I

    return v0
.end method

.method public getParam()Lcom/jieli/jl_bt_ota/model/base/BaseParameter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TP;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->param:Lcom/jieli/jl_bt_ota/model/base/BaseParameter;

    return-object v0
.end method

.method public getResponse()Lcom/jieli/jl_bt_ota/model/base/CommonResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->response:Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->status:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->OpCodeSn:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->opCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isResponseCmd()Z
    .locals 4

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->type:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    return v3

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->param:Lcom/jieli/jl_bt_ota/model/base/BaseParameter;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->response:Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    if-eqz v0, :cond_1

    return v2

    :cond_1
    return v3

    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->param:Lcom/jieli/jl_bt_ota/model/base/BaseParameter;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->response:Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    if-eqz v0, :cond_3

    return v2

    :cond_3
    return v3
.end method

.method public setOpCodeSn(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->OpCodeSn:I

    return-object p0
.end method

.method public setParam(Lcom/jieli/jl_bt_ota/model/base/BaseParameter;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;)",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase;"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->param:Lcom/jieli/jl_bt_ota/model/base/BaseParameter;

    return-object p0
.end method

.method public setResponse(Lcom/jieli/jl_bt_ota/model/base/CommonResponse;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase;"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->response:Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    return-object p0
.end method

.method public setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->status:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CommandBase{OpCodeSn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->OpCodeSn:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", opCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->opCode:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n param="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->param:Lcom/jieli/jl_bt_ota/model/base/BaseParameter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n response="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->response:Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
