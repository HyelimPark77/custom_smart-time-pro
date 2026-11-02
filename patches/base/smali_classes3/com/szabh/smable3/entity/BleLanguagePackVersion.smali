.class public final Lcom/szabh/smable3/entity/BleLanguagePackVersion;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# instance fields
.field private mLanguageCode:I

.field private mVersion:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v2}, Lcom/szabh/smable3/entity/BleLanguagePackVersion;-><init>(Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 5
    const-string p1, "0.0.0"

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x1

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/entity/BleLanguagePackVersion;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic OXO1(B)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->decode$lambda$0(B)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleLanguagePackVersion;Ljava/lang/String;IILjava/lang/Object;)Lcom/szabh/smable3/entity/BleLanguagePackVersion;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->copy(Ljava/lang/String;I)Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    move-result-object p0

    return-object p0
.end method

.method private static final decode$lambda$0(B)Ljava/lang/CharSequence;
    .locals 1

    and-int/lit16 p0, p0, 0xff

    const/16 v0, 0x9

    if-le p0, v0, :cond_0

    const-string p0, "0"

    return-object p0

    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    return v0
.end method

.method public final copy(Ljava/lang/String;I)Lcom/szabh/smable3/entity/BleLanguagePackVersion;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    invoke-direct {v0, p1, p2}, Lcom/szabh/smable3/entity/BleLanguagePackVersion;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public decode()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v0, v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    new-instance v7, Lcom/android/mltcode/paycertificationapi/OIOi1X;

    invoke-direct {v7}, Lcom/android/mltcode/paycertificationapi/OIOi1X;-><init>()V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const-string v2, "."

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/ArraysKt___ArraysKt;->i0I([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    :cond_0
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMLanguageCode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    return v0
.end method

.method public final getMVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMLanguageCode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    return-void
.end method

.method public final setMVersion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleLanguagePackVersion(mVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mLanguageCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->mLanguageCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
