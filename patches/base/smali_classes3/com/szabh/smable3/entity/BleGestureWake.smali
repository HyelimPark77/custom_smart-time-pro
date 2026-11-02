.class public final Lcom/szabh/smable3/entity/BleGestureWake;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleGestureWake$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleGestureWake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGestureWake.kt\ncom/szabh/smable3/entity/BleGestureWake\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,25:1\n222#2,4:26\n*S KotlinDebug\n*F\n+ 1 BleGestureWake.kt\ncom/szabh/smable3/entity/BleGestureWake\n*L\n18#1:26,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleGestureWake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGestureWake.kt\ncom/szabh/smable3/entity/BleGestureWake\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,25:1\n222#2,4:26\n*S KotlinDebug\n*F\n+ 1 BleGestureWake.kt\ncom/szabh/smable3/entity/BleGestureWake\n*L\n18#1:26,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleGestureWake$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x5


# instance fields
.field private mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleGestureWake$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleGestureWake$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleGestureWake;->Companion:Lcom/szabh/smable3/entity/BleGestureWake$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/szabh/smable3/entity/BleGestureWake;-><init>(Lcom/szabh/smable3/entity/BleTimeRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleTimeRange;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mBleTimeRange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/szabh/smable3/entity/BleTimeRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    new-instance v0, Lcom/szabh/smable3/entity/BleTimeRange;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleTimeRange;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/szabh/smable3/entity/BleGestureWake;-><init>(Lcom/szabh/smable3/entity/BleTimeRange;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleGestureWake;Lcom/szabh/smable3/entity/BleTimeRange;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleGestureWake;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleGestureWake;->copy(Lcom/szabh/smable3/entity/BleTimeRange;)Lcom/szabh/smable3/entity/BleGestureWake;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/szabh/smable3/entity/BleTimeRange;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    return-object v0
.end method

.method public final copy(Lcom/szabh/smable3/entity/BleTimeRange;)Lcom/szabh/smable3/entity/BleGestureWake;
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mBleTimeRange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleGestureWake;

    invoke-direct {v0, p1}, Lcom/szabh/smable3/entity/BleGestureWake;-><init>(Lcom/szabh/smable3/entity/BleTimeRange;)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-class v0, Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v1, 0x5

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleTimeRange;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleGestureWake;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleGestureWake;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleTimeRange;->hashCode()I

    move-result v0

    return v0
.end method

.method public final setMBleTimeRange(Lcom/szabh/smable3/entity/BleTimeRange;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGestureWake(mBleTimeRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGestureWake;->mBleTimeRange:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
