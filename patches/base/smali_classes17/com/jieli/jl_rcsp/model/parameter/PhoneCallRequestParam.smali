.class public Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# static fields
.field public static final TYPE_LAST_NUMBER:I = 0x0

.field public static final TYPE_SPECIAL_NUMBER:I = 0x1


# instance fields
.field private number:Ljava/lang/String;

.field private type:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->number:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->number:Ljava/lang/String;

    return-object v0
.end method

.method public getParamData()[B
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->number:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    new-array v0, v2, [B

    aput-byte v1, v0, v1

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->number:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v3, v0

    add-int/2addr v3, v2

    new-array v3, v3, [B

    aput-byte v2, v3, v1

    array-length v4, v0

    invoke-static {v0, v1, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v3
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->type:I

    return v0
.end method

.method public setNumber(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->number:Ljava/lang/String;

    return-object p0
.end method

.method public setType(I)Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->type:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PhoneCallRequestParam{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", number=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->number:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
