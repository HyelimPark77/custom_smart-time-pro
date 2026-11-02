.class public final Lcom/szabh/smable3/entity/BleFactoryTest;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleFactoryTest$Companion;,
        Lcom/szabh/smable3/entity/BleFactoryTest$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleFactoryTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleFactoryTest\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,353:1\n277#2,5:354\n277#2,5:379\n222#3,4:359\n222#3,4:363\n222#3,4:367\n222#3,4:371\n222#3,4:375\n222#3,4:384\n222#3,4:388\n*S KotlinDebug\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleFactoryTest\n*L\n29#1:354,5\n53#1:379,5\n33#1:359,4\n37#1:363,4\n41#1:367,4\n45#1:371,4\n49#1:375,4\n58#1:384,4\n66#1:388,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleFactoryTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleFactoryTest\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,353:1\n277#2,5:354\n277#2,5:379\n222#3,4:359\n222#3,4:363\n222#3,4:367\n222#3,4:371\n222#3,4:375\n222#3,4:384\n222#3,4:388\n*S KotlinDebug\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleFactoryTest\n*L\n29#1:354,5\n53#1:379,5\n33#1:359,4\n37#1:363,4\n41#1:367,4\n45#1:371,4\n49#1:375,4\n58#1:384,4\n66#1:388,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleFactoryTest$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final STATUS_FAILED:I = 0x1

.field public static final STATUS_SUCCESS:I


# instance fields
.field private mResponse:Ljava/lang/Object;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mType:Lcom/szabh/smable3/entity/FactoryTestType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleFactoryTest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleFactoryTest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleFactoryTest;->Companion:Lcom/szabh/smable3/entity/BleFactoryTest$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/szabh/smable3/entity/BleFactoryTest;-><init>(Lcom/szabh/smable3/entity/FactoryTestType;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/FactoryTestType;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/FactoryTestType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mResponse"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/szabh/smable3/entity/FactoryTestType;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 5
    sget-object p1, Lcom/szabh/smable3/entity/FactoryTestType;->ENTER:Lcom/szabh/smable3/entity/FactoryTestType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 6
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/entity/BleFactoryTest;-><init>(Lcom/szabh/smable3/entity/FactoryTestType;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleFactoryTest;Lcom/szabh/smable3/entity/FactoryTestType;Ljava/lang/Object;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleFactoryTest;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleFactoryTest;->copy(Lcom/szabh/smable3/entity/FactoryTestType;Ljava/lang/Object;)Lcom/szabh/smable3/entity/BleFactoryTest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/szabh/smable3/entity/FactoryTestType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    return-object v0
.end method

.method public final component2()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    return-object v0
.end method

.method public final copy(Lcom/szabh/smable3/entity/FactoryTestType;Ljava/lang/Object;)Lcom/szabh/smable3/entity/BleFactoryTest;
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/FactoryTestType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mResponse"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleFactoryTest;

    invoke-direct {v0, p1, p2}, Lcom/szabh/smable3/entity/BleFactoryTest;-><init>(Lcom/szabh/smable3/entity/FactoryTestType;Ljava/lang/Object;)V

    return-object v0
.end method

.method public decode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Lcom/szabh/smable3/entity/FactoryTestType;->Companion:Lcom/szabh/smable3/entity/FactoryTestType$Companion;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/FactoryTestType$Companion;->of(I)Lcom/szabh/smable3/entity/FactoryTestType;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    sget-object v1, Lcom/szabh/smable3/entity/BleFactoryTest$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const-string v1, "also(...)"

    const/4 v2, 0x1

    const/4 v3, 0x2

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v0, v0

    if-le v0, v3, :cond_0

    const-class v0, Lcom/szabh/smable3/entity/BleVcareCalcData;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v1, 0x5

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v0, v0

    if-le v0, v3, :cond_1

    const-class v0, Lcom/szabh/smable3/entity/BleHrLeakData;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v3, v0

    const-class v4, Lcom/szabh/smable3/entity/BleHardwareInfo;

    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-static {v0, v2, v3}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v5}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    move-object v0, v5

    goto/16 :goto_1

    :pswitch_3
    const-class v0, Lcom/szabh/smable3/entity/BleStewingData;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v1, 0xd

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_4
    const-class v0, Lcom/szabh/smable3/entity/BleTestKeyData;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    const-class v0, Lcom/szabh/smable3/entity/BleTuyaKey;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v1, 0x3d

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    const-class v0, Lcom/szabh/smable3/entity/BleGsensorData;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v1, 0x7

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_7
    const-class v0, Lcom/szabh/smable3/entity/BleVersion;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v1, 0x3

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_8
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v3, v0

    const-class v4, Lcom/szabh/smable3/entity/BleTestSupportData;

    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-static {v0, v2, v3}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v5}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :goto_1
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public encode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/FactoryTestType;->getType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleFactoryTest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleFactoryTest;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final getMResponse()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    return-object v0
.end method

.method public final getMType()Lcom/szabh/smable3/entity/FactoryTestType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMResponse(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    return-void
.end method

.method public final setMType(Lcom/szabh/smable3/entity/FactoryTestType;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/FactoryTestType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleFactoryTest(mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mType:Lcom/szabh/smable3/entity/FactoryTestType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleFactoryTest;->mResponse:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
