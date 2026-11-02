.class public final Lcom/sma/smartv3/model/WatchFaceCategory;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/model/WatchFaceCategory$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/model/WatchFaceCategory$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_BUSINESS:I = 0x3

.field public static final TYPE_CUSTOM:I = 0x64

.field public static final TYPE_DYNAMIC:I = 0x1

.field public static final TYPE_EXERCISE:I = 0x2

.field public static final TYPE_ILLUSTRATION:I = 0x6

.field public static final TYPE_MACHINERY:I = 0x4

.field public static final TYPE_OTHER:I = 0x0

.field public static final TYPE_SIMPLE:I = 0x5


# instance fields
.field private final dir:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private list:[Lcom/sma/smartv3/model/WatchFaceInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final total:I

.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/model/WatchFaceCategory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/model/WatchFaceCategory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/model/WatchFaceCategory;->Companion:Lcom/sma/smartv3/model/WatchFaceCategory$Companion;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I[Lcom/sma/smartv3/model/WatchFaceInfo;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # [Lcom/sma/smartv3/model/WatchFaceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "dir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->type:I

    iput-object p2, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->dir:Ljava/lang/String;

    iput p3, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->total:I

    iput-object p4, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/WatchFaceCategory;ILjava/lang/String;I[Lcom/sma/smartv3/model/WatchFaceInfo;ILjava/lang/Object;)Lcom/sma/smartv3/model/WatchFaceCategory;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->type:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->dir:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->total:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/WatchFaceCategory;->copy(ILjava/lang/String;I[Lcom/sma/smartv3/model/WatchFaceInfo;)Lcom/sma/smartv3/model/WatchFaceCategory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->type:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->dir:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->total:I

    return v0
.end method

.method public final component4()[Lcom/sma/smartv3/model/WatchFaceInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;I[Lcom/sma/smartv3/model/WatchFaceInfo;)Lcom/sma/smartv3/model/WatchFaceCategory;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # [Lcom/sma/smartv3/model/WatchFaceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "dir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/model/WatchFaceCategory;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/WatchFaceCategory;-><init>(ILjava/lang/String;I[Lcom/sma/smartv3/model/WatchFaceInfo;)V

    return-object v0
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
    instance-of v1, p1, Lcom/sma/smartv3/model/WatchFaceCategory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/WatchFaceCategory;

    iget v1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->type:I

    iget v3, p1, Lcom/sma/smartv3/model/WatchFaceCategory;->type:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->dir:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/WatchFaceCategory;->dir:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->total:I

    iget v3, p1, Lcom/sma/smartv3/model/WatchFaceCategory;->total:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    iget-object p1, p1, Lcom/sma/smartv3/model/WatchFaceCategory;->list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDir()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->dir:Ljava/lang/String;

    return-object v0
.end method

.method public final getList()[Lcom/sma/smartv3/model/WatchFaceInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    return-object v0
.end method

.method public final getTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->total:I

    return v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->type:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->dir:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->total:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setList([Lcom/sma/smartv3/model/WatchFaceInfo;)V
    .locals 1
    .param p1    # [Lcom/sma/smartv3/model/WatchFaceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->type:I

    iget-object v1, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->dir:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->total:I

    iget-object v3, p0, Lcom/sma/smartv3/model/WatchFaceCategory;->list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WatchFaceCategory(type="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", dir="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", total="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", list="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
