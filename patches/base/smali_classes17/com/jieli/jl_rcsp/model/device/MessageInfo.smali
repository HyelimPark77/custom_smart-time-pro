.class public Lcom/jieli/jl_rcsp/model/device/MessageInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LIMIT_PACKAGE:I = 0xf0

.field public static final LIMIT_PACKAGE_NAME:I = 0x1f

.field public static final LIMIT_TITLE:I = 0x24

.field public static final LIMIT_TOTAL_LEN:I = 0x200


# instance fields
.field private final appPackageName:[B

.field private final content:[B

.field private final flag:I

.field private final timestamp:[B

.field private final title:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1f

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->getData(Ljava/lang/String;I)[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->appPackageName:[B

    iput p2, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->flag:I

    const/16 p1, 0x24

    invoke-static {p3, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->getData(Ljava/lang/String;I)[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->title:[B

    const/16 p1, 0x1a8

    invoke-static {p4, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->getData(Ljava/lang/String;I)[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->content:[B

    invoke-static {p5, p6}, Lcom/jieli/jl_rcsp/util/RcspUtil;->time2Int(J)I

    move-result p1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->timestamp:[B

    return-void
.end method


# virtual methods
.method public beanToData()[B
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-object v3, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->timestamp:[B

    invoke-static {v1, v3}, Lcom/jieli/jl_rcsp/util/RcspUtil;->packLTVPacket2(I[B)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    iget-object v3, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->appPackageName:[B

    invoke-static {v0, v3}, Lcom/jieli/jl_rcsp/util/RcspUtil;->packLTVPacket2(I[B)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    iget v3, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->flag:I

    int-to-byte v3, v3

    new-array v0, v0, [B

    aput-byte v3, v0, v1

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->packLTVPacket2(I[B)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->title:[B

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->packLTVPacket2(I[B)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->content:[B

    if-eqz v0, :cond_1

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->packLTVPacket2(I[B)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_2
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public getAppPackageName()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->appPackageName:[B

    return-object v0
.end method

.method public getContent()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->content:[B

    return-object v0
.end method

.method public getFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->flag:I

    return v0
.end method

.method public getTimestamp()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->timestamp:[B

    return-object v0
.end method

.method public getTitle()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->title:[B

    return-object v0
.end method
