.class public Lcom/jieli/jl_filebrowse/FileBrowseUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "FileBrowseUtil"

.field public static b:B = 0x0t

.field public static final c:[B

.field public static final d:B = -0x11t


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->c:[B

    return-void

    nop

    :array_0
    .array-data 1
        -0x2t
        -0x24t
        -0x46t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static coverPathDataToCmd(Lcom/jieli/jl_filebrowse/bean/PathData;)[B
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    new-array p0, v0, [B

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/PathData;->toData()[B

    move-result-object p0

    if-eqz p0, :cond_2

    array-length v1, p0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    array-length v1, p0

    add-int/lit8 v1, v1, 0x1

    int-to-short v1, v1

    add-int/lit8 v2, v1, 0x8

    new-array v2, v2, [B

    sget-object v3, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->c:[B

    const/4 v4, 0x3

    invoke-static {v3, v0, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v3, -0x40

    aput-byte v3, v2, v4

    const/4 v3, 0x4

    const/16 v4, 0xc

    aput-byte v4, v2, v3

    shr-int/lit8 v3, v1, 0x8

    int-to-byte v3, v3

    const/4 v4, 0x5

    aput-byte v3, v2, v4

    and-int/lit16 v3, v1, 0xff

    int-to-byte v3, v3

    const/4 v4, 0x6

    aput-byte v3, v2, v4

    sget-byte v3, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->b:B

    add-int/lit8 v4, v3, 0x1

    int-to-byte v4, v4

    sput-byte v4, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->b:B

    const/4 v4, 0x7

    aput-byte v3, v2, v4

    array-length v3, p0

    const/16 v5, 0x8

    invoke-static {p0, v0, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v4

    const/16 p0, -0x11

    aput-byte p0, v2, v1

    sget-object p0, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "data : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "coverPathDataToCmd"

    invoke-static {p0, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_2
    :goto_0
    new-array p0, v0, [B

    return-object p0
.end method

.method public static getDevName(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "Unknown Type[%d]"

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "Flash3"

    return-object p0

    :pswitch_1
    const-string p0, "Flash2"

    return-object p0

    :pswitch_2
    const-string p0, "LineIn"

    return-object p0

    :pswitch_3
    const-string p0, "Flash"

    return-object p0

    :pswitch_4
    const-string p0, "SD Card 1"

    return-object p0

    :pswitch_5
    const-string p0, "SD Card 0"

    return-object p0

    :pswitch_6
    const-string p0, "USB"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseData([B)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->parseFileStruct([BILjava/util/List;)I

    return-object v0

    :cond_1
    :goto_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static parseDataHasPacket([B)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    array-length v0, p0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    array-length v0, p0

    sub-int/2addr v0, v1

    new-array v1, v0, [B

    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-static {p0, v2, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1}, Lcom/jieli/jl_filebrowse/FileBrowseUtil;->parseData([B)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method
