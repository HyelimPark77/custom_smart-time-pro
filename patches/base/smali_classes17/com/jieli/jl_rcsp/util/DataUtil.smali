.class public Lcom/jieli/jl_rcsp/util/DataUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parseLTVData2([B)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/LtvBean;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_2

    array-length v0, p0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    add-int/lit8 v4, v3, 0x1

    array-length v5, p0

    if-ge v4, v5, :cond_1

    invoke-static {p0, v3, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    add-int/lit8 v5, v3, 0x2

    add-int v6, v5, v4

    array-length v7, p0

    if-gt v6, v7, :cond_1

    aget-byte v5, p0, v5

    invoke-static {v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v5

    add-int/lit8 v3, v3, 0x3

    add-int/lit8 v6, v4, -0x1

    new-array v7, v6, [B

    invoke-static {p0, v3, v7, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    new-instance v6, Lcom/jieli/jl_rcsp/model/LtvBean;

    invoke-direct {v6, v4, v5, v7}, Lcom/jieli/jl_rcsp/model/LtvBean;-><init>(II[B)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method
