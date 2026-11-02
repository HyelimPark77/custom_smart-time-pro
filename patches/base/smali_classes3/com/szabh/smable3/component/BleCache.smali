.class public final Lcom/szabh/smable3/component/BleCache;
.super Lcom/szabh/smable3/component/BaseBleCache;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/szabh/smable3/component/BleCache;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static _delegateCache:Lcom/szabh/smable3/component/BaseBleCache;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/BleCache;

    invoke-direct {v0}, Lcom/szabh/smable3/component/BleCache;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/szabh/smable3/component/BaseBleCache;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final activateMultiDeviceActiveBleCache(Lcom/szabh/smable3/component/BaseBleCache;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/component/BaseBleCache;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/szabh/smable3/component/BleCache;->_delegateCache:Lcom/szabh/smable3/component/BaseBleCache;

    sput-object p1, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    return-void
.end method

.method public clear()V
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->clear()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleCache;->clear()V

    return-void
.end method

.method public getBoolean(Lcom/szabh/smable3/BleKey;ZLcom/szabh/smable3/BleKeyFlag;)Z
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getBoolean(Lcom/szabh/smable3/BleKey;ZLcom/szabh/smable3/BleKeyFlag;)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getBoolean(Lcom/szabh/smable3/BleKey;ZLcom/szabh/smable3/BleKeyFlag;)Z

    move-result p1

    return p1
.end method

.method public getIdObjects(Lcom/szabh/smable3/BleKey;)Ljava/util/List;
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/BleKey;",
            ")",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleIdObject;",
            ">;"
        }
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleCache;->getIdObjects(Lcom/szabh/smable3/BleKey;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BaseBleCache;->getIdObjects(Lcom/szabh/smable3/BleKey;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getInt(Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;)I
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getInt(Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;)I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getInt(Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;)I

    move-result p1

    return p1
.end method

.method public getList(Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;)Ljava/util/List;
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/szabh/smable3/BleKey;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/szabh/smable3/BleKeyFlag;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getList(Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getList(Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getLong(Lcom/szabh/smable3/BleKey;JLcom/szabh/smable3/BleKeyFlag;)J
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/component/BaseBleCache;->getLong(Lcom/szabh/smable3/BleKey;JLcom/szabh/smable3/BleKeyFlag;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/component/BaseBleCache;->getLong(Lcom/szabh/smable3/BleKey;JLcom/szabh/smable3/BleKeyFlag;)J

    move-result-wide p1

    return-wide p1
.end method

.method public getMDeviceInfo()Lcom/szabh/smable3/entity/BleDeviceInfo;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->_delegateCache:Lcom/szabh/smable3/component/BaseBleCache;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v2, "BleCache  get failed: delegate cache is not initialized"

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-object v1

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMDeviceInfo()Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public getObject(Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/szabh/smable3/BleKey;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/szabh/smable3/BleKeyFlag;",
            ")TT;"
        }
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getObject(Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getObject(Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getObjectNotNull(Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/szabh/smable3/BleKey;",
            "Ljava/lang/Class<",
            "TT;>;TT;",
            "Lcom/szabh/smable3/BleKeyFlag;",
            ")TT;"
        }
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull(Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull(Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getString(Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;)Ljava/lang/String;
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "def"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getString(Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->getString(Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public putBoolean(Lcom/szabh/smable3/BleKey;ZLcom/szabh/smable3/BleKeyFlag;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putBoolean(Lcom/szabh/smable3/BleKey;ZLcom/szabh/smable3/BleKeyFlag;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putBoolean(Lcom/szabh/smable3/BleKey;ZLcom/szabh/smable3/BleKeyFlag;)V

    return-void
.end method

.method public putInt(Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putInt(Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putInt(Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;)V

    return-void
.end method

.method public putList(Lcom/szabh/smable3/BleKey;Ljava/util/List;Lcom/szabh/smable3/BleKeyFlag;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/szabh/smable3/BleKey;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/szabh/smable3/BleKeyFlag;",
            ")V"
        }
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putList(Lcom/szabh/smable3/BleKey;Ljava/util/List;Lcom/szabh/smable3/BleKeyFlag;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putList(Lcom/szabh/smable3/BleKey;Ljava/util/List;Lcom/szabh/smable3/BleKeyFlag;)V

    return-void
.end method

.method public putLong(Lcom/szabh/smable3/BleKey;JLcom/szabh/smable3/BleKeyFlag;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/component/BaseBleCache;->putLong(Lcom/szabh/smable3/BleKey;JLcom/szabh/smable3/BleKeyFlag;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/component/BaseBleCache;->putLong(Lcom/szabh/smable3/BleKey;JLcom/szabh/smable3/BleKeyFlag;)V

    return-void
.end method

.method public putObject(Lcom/szabh/smable3/BleKey;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/szabh/smable3/BleKey;",
            "TT;",
            "Lcom/szabh/smable3/BleKeyFlag;",
            ")V"
        }
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putObject(Lcom/szabh/smable3/BleKey;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putObject(Lcom/szabh/smable3/BleKey;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;)V

    return-void
.end method

.method public putString(Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->multiDeviceActiveBleCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putString(Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putString(Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;)V

    return-void
.end method

.method public setMDeviceInfo(Lcom/szabh/smable3/entity/BleDeviceInfo;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->_delegateCache:Lcom/szabh/smable3/component/BaseBleCache;

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "BleCache  set failed: delegate cache is not initialized"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleCache;->setMDeviceInfo(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    :cond_1
    return-void
.end method
