.class public final Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,281:1\n774#2:282\n865#2,2:283\n774#2:290\n865#2,2:291\n1#3:285\n11571#4:286\n11906#4,3:287\n*S KotlinDebug\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion\n*L\n137#1:282\n137#1:283,2\n147#1:290\n147#1:291,2\n147#1:286\n147#1:287,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,281:1\n774#2:282\n865#2,2:283\n774#2:290\n865#2,2:291\n1#3:285\n11571#4:286\n11906#4,3:287\n*S KotlinDebug\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion\n*L\n137#1:282\n137#1:283,2\n147#1:290\n147#1:291,2\n147#1:286\n147#1:287,3\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromBytes([B)Ljava/util/List;
    .locals 5
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;"
        }
    .end annotation

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-byte v3, p1, v2

    sget-object v4, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->Companion:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion;

    invoke-virtual {v4, v3}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion;->of(I)Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->getValue()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public final fromMask(J)Ljava/util/List;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fromMask mask="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->getValue()I

    move-result v4

    const/16 v5, 0x40

    if-ge v4, v5, :cond_0

    const-wide/16 v4, 0x1

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->getValue()I

    move-result v3

    shl-long v3, v4, v3

    and-long/2addr v3, p1

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final of(I)Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->getValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    if-nez v1, :cond_2

    sget-object p1, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->VR_100WP25:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    return-object p1

    :cond_2
    return-object v1
.end method
