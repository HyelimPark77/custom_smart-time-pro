.class public final Lcom/szabh/smable3/entity/BleSGTest;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private mType:Lcom/szabh/smable3/entity/SGTestType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/szabh/smable3/entity/BleSGTest;-><init>(Lcom/szabh/smable3/entity/SGTestType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/SGTestType;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/SGTestType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/szabh/smable3/entity/SGTestType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Lcom/szabh/smable3/entity/SGTestType;->ENTER:Lcom/szabh/smable3/entity/SGTestType;

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/szabh/smable3/entity/BleSGTest;-><init>(Lcom/szabh/smable3/entity/SGTestType;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleSGTest;Lcom/szabh/smable3/entity/SGTestType;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSGTest;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleSGTest;->copy(Lcom/szabh/smable3/entity/SGTestType;)Lcom/szabh/smable3/entity/BleSGTest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/szabh/smable3/entity/SGTestType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    return-object v0
.end method

.method public final copy(Lcom/szabh/smable3/entity/SGTestType;)Lcom/szabh/smable3/entity/BleSGTest;
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/SGTestType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleSGTest;

    invoke-direct {v0, p1}, Lcom/szabh/smable3/entity/BleSGTest;-><init>(Lcom/szabh/smable3/entity/SGTestType;)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Lcom/szabh/smable3/entity/SGTestType;->Companion:Lcom/szabh/smable3/entity/SGTestType$Companion;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/SGTestType$Companion;->of(I)Lcom/szabh/smable3/entity/SGTestType;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/SGTestType;->getType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleSGTest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleSGTest;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final getMType()Lcom/szabh/smable3/entity/SGTestType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final setMType(Lcom/szabh/smable3/entity/SGTestType;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/SGTestType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleSGTest(mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGTest;->mType:Lcom/szabh/smable3/entity/SGTestType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
