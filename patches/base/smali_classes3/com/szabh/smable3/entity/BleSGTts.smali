.class public final Lcom/szabh/smable3/entity/BleSGTts;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# instance fields
.field private mCharset:Ljava/nio/charset/Charset;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTts:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/szabh/smable3/entity/BleSGTts;-><init>(Ljava/nio/charset/Charset;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/nio/charset/Charset;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/nio/charset/Charset;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mCharset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/nio/charset/Charset;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 5
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string p4, "UTF_8"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 6
    const-string p2, ""

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/entity/BleSGTts;-><init>(Ljava/nio/charset/Charset;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleSGTts;Ljava/nio/charset/Charset;Ljava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSGTts;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleSGTts;->copy(Ljava/nio/charset/Charset;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleSGTts;

    move-result-object p0

    return-object p0
.end method

.method private final isUtf8([B)Z
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_d

    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    const/16 v3, 0x7f

    if-gt v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 v3, 0xc2

    const/16 v4, 0xe0

    const/16 v5, 0x80

    if-gt v3, v2, :cond_3

    if-ge v2, v4, :cond_3

    add-int/lit8 v2, v1, 0x1

    array-length v3, p1

    if-lt v2, v3, :cond_1

    return v0

    :cond_1
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xc0

    if-eq v2, v5, :cond_2

    return v0

    :cond_2
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_3
    const/16 v3, 0xf0

    if-gt v4, v2, :cond_7

    if-ge v2, v3, :cond_7

    add-int/lit8 v2, v1, 0x2

    array-length v3, p1

    if-lt v2, v3, :cond_4

    return v0

    :cond_4
    add-int/lit8 v3, v1, 0x1

    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xc0

    if-eq v3, v5, :cond_5

    return v0

    :cond_5
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xc0

    if-eq v2, v5, :cond_6

    return v0

    :cond_6
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_7
    if-gt v3, v2, :cond_c

    const/16 v3, 0xf5

    if-ge v2, v3, :cond_c

    add-int/lit8 v2, v1, 0x3

    array-length v3, p1

    if-lt v2, v3, :cond_8

    return v0

    :cond_8
    add-int/lit8 v3, v1, 0x1

    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xc0

    if-eq v3, v5, :cond_9

    return v0

    :cond_9
    add-int/lit8 v3, v1, 0x2

    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xc0

    if-eq v3, v5, :cond_a

    return v0

    :cond_a
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xc0

    if-eq v2, v5, :cond_b

    return v0

    :cond_b
    add-int/lit8 v1, v1, 0x4

    goto :goto_0

    :cond_c
    return v0

    :cond_d
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final component1()Ljava/nio/charset/Charset;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/nio/charset/Charset;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleSGTts;
    .locals 1
    .param p1    # Ljava/nio/charset/Charset;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mCharset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleSGTts;

    invoke-direct {v0, p1, p2}, Lcom/szabh/smable3/entity/BleSGTts;-><init>(Ljava/nio/charset/Charset;Ljava/lang/String;)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/szabh/smable3/entity/BleSGTts;->isUtf8([B)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GBK"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_1

    :cond_1
    const-string v0, ""

    :goto_1
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleSGTts;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleSGTts;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMCharset()Ljava/nio/charset/Charset;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public final getMTts()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCharset(Ljava/nio/charset/Charset;)V
    .locals 1
    .param p1    # Ljava/nio/charset/Charset;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    return-void
.end method

.method public final setMTts(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleSGTTS(mCharset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGTts;->mCharset:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGTts;->mTts:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
