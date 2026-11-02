.class public final Lcom/szabh/smable3/entity/AIImageResolution$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/AIImageResolution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleSGSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSGSet.kt\ncom/szabh/smable3/entity/AIImageResolution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n774#2:68\n865#2,2:69\n1#3:71\n*S KotlinDebug\n*F\n+ 1 BleSGSet.kt\ncom/szabh/smable3/entity/AIImageResolution$Companion\n*L\n57#1:68\n57#1:69,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleSGSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSGSet.kt\ncom/szabh/smable3/entity/AIImageResolution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n774#2:68\n865#2,2:69\n1#3:71\n*S KotlinDebug\n*F\n+ 1 BleSGSet.kt\ncom/szabh/smable3/entity/AIImageResolution$Companion\n*L\n57#1:68\n57#1:69,2\n*E\n"
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
    invoke-direct {p0}, Lcom/szabh/smable3/entity/AIImageResolution$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromMask(I)Ljava/util/List;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/AIImageResolution;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/szabh/smable3/entity/AIImageResolution;->getEntries()Lkotlin/enums/EnumEntries;

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

    check-cast v3, Lcom/szabh/smable3/entity/AIImageResolution;

    const/4 v4, 0x1

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/AIImageResolution;->getValue()I

    move-result v3

    shl-int v3, v4, v3

    and-int/2addr v3, p1

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final of(I)Lcom/szabh/smable3/entity/AIImageResolution;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/szabh/smable3/entity/AIImageResolution;->getEntries()Lkotlin/enums/EnumEntries;

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

    check-cast v2, Lcom/szabh/smable3/entity/AIImageResolution;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/AIImageResolution;->getValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/szabh/smable3/entity/AIImageResolution;

    if-nez v1, :cond_2

    sget-object p1, Lcom/szabh/smable3/entity/AIImageResolution;->IR_180P:Lcom/szabh/smable3/entity/AIImageResolution;

    return-object p1

    :cond_2
    return-object v1
.end method
