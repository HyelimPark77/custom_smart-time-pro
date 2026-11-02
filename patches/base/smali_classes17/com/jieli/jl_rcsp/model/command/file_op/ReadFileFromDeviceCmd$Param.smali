.class public Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# static fields
.field public static final OP_CANCEL:B = -0x7ft

.field public static final OP_START_WITH_CLUSTER:B = 0x1t

.field public static final OP_START_WITH_DEV_AND_NAME:B = 0x2t

.field public static final OP_START_WITH_NAME:B = 0x0t

.field public static final OP_STOP:B = -0x80t

.field public static final OP_UNKNOWN:B = -0x1t


# instance fields
.field public op:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    return-void
.end method

.method public static getNameData(Ljava/lang/String;Z)[B
    .locals 3

    if-nez p1, :cond_0

    const-string p1, "gbk"

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0

    :cond_0
    const-string p1, "\\U"

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p1, p1

    array-length v1, p0

    invoke-static {p0, v2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public getParamData()[B
    .locals 3

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method
