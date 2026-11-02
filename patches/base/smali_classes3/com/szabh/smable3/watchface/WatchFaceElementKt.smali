.class public final Lcom/szabh/smable3/watchface/WatchFaceElementKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic access$colorToRgb565(Ljava/lang/String;)[B
    .locals 0

    invoke-static {p0}, Lcom/szabh/smable3/watchface/WatchFaceElementKt;->colorToRgb565(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method private static final colorToRgb565(Ljava/lang/String;)[B
    .locals 12

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/16 v2, 0xff

    const/4 v3, 0x0

    const-string v4, "#"

    invoke-static {p0, v4}, Lkotlin/text/StringsKt__StringsKt;->IiIiIiX(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x3

    const/16 v6, 0x10

    const-string v7, "substring(...)"

    if-eq v4, v5, :cond_1

    const/4 v8, 0x6

    if-eq v4, v8, :cond_0

    move p0, v2

    move v4, p0

    move v10, v4

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lkotlin/text/OXO1;->OXO1(I)I

    move-result v9

    invoke-static {v4, v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v9, 0x4

    invoke-virtual {p0, v1, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lkotlin/text/OXO1;->OXO1(I)I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    invoke-virtual {p0, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lkotlin/text/OXO1;->OXO1(I)I

    move-result v6

    invoke-static {p0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v1}, Lcom/android/mltcode/paycertificationapi/oe5;->OXOO0X0i(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6}, Lkotlin/text/OXO1;->OXO1(I)I

    move-result v8

    invoke-static {v4, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v1}, Lcom/android/mltcode/paycertificationapi/oe5;->OXOO0X0i(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6}, Lkotlin/text/OXO1;->OXO1(I)I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    invoke-virtual {p0, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/oe5;->OXOO0X0i(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {v6}, Lkotlin/text/OXO1;->OXO1(I)I

    move-result v6

    invoke-static {p0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    :goto_0
    and-int/lit16 v4, v4, 0xf8

    shl-int/lit8 v4, v4, 0x8

    and-int/lit16 v6, v10, 0xfc

    shl-int/2addr v6, v5

    or-int/2addr v4, v6

    shr-int/2addr p0, v5

    or-int/2addr p0, v4

    and-int/lit16 v4, p0, 0xff

    int-to-byte v4, v4

    shr-int/lit8 p0, p0, 0x8

    and-int/2addr p0, v2

    int-to-byte p0, p0

    new-array v1, v1, [B

    aput-byte v4, v1, v3

    aput-byte p0, v1, v0

    return-object v1
.end method
