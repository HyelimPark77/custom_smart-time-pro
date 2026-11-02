.class public final Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWeekPlanTimeV2$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleWeekPlanTimeV2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,327:1\n37#2,2:328\n37#2,2:330\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleWeekPlanTimeV2\n*L\n291#1:328,2\n313#1:330,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleWeekPlanTimeV2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,327:1\n37#2,2:328\n37#2,2:330\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleWeekPlanTimeV2\n*L\n291#1:328,2\n313#1:330,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWeekPlanTimeV2$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x4


# instance fields
.field private mList:[Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->Companion:Lcom/szabh/smable3/entity/BleWeekPlanTimeV2$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;-><init>([Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 6
    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [Ljava/lang/Integer;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Integer;

    .line 8
    invoke-direct {p0, p1}, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;-><init>([Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/Integer;)V
    .locals 1
    .param p1    # [Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>([Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 5
    new-array p1, p1, [Ljava/lang/Integer;

    :cond_0
    invoke-direct {p0, p1}, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;-><init>([Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;[Ljava/lang/Integer;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->copy([Ljava/lang/Integer;)Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()[Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy([Ljava/lang/Integer;)Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;
    .locals 1
    .param p1    # [Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;

    invoke-direct {v0, p1}, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;-><init>([Ljava/lang/Integer;)V

    return-object v0
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/16 v3, 0x20

    if-ge v2, v3, :cond_0

    const/4 v3, 0x1

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O1OOiOO1i;->I11X11OX(Ljava/util/List;)V

    new-array v1, v1, [Ljava/lang/Integer;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    return-void
.end method

.method public encode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    const/16 v0, 0x1f

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_1

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    array-length v2, v1

    const/4 v3, 0x1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final getMList()[Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final setMList([Ljava/lang/Integer;)V
    .locals 1
    .param p1    # [Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWeekPlanTime(mList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->mList:[Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
