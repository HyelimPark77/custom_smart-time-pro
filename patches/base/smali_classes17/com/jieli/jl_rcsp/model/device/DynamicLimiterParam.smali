.class public Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MASK:I = 0x2


# instance fields
.field private value:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;->setValue(I)V

    return-void
.end method

.method public static parseData([B)Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;
    .locals 3

    if-eqz p0, :cond_1

    array-length v0, p0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;

    const/4 v2, 0x0

    invoke-static {p0, v2, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;-><init>(I)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;->value:I

    return v0
.end method

.method public setValue(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;->value:I

    return-void
.end method

.method public toData()[B
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;->value:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DynamicLimiterParam{value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DynamicLimiterParam;->value:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
