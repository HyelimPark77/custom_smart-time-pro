.class public Lcom/bestmafen/androidbase/base/BaseApplication;
.super Landroid/app/Application;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;
    }
.end annotation


# static fields
.field public static final I1:Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final iX1O1:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final IO:Ljava/util/Set;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/android/mltcode/paycertificationapi/s5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/bestmafen/androidbase/base/BaseApplication;->I1:Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sput-object v0, Lcom/bestmafen/androidbase/base/BaseApplication;->iX1O1:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/bestmafen/androidbase/base/BaseApplication;->IO:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic OXO1()Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 1

    sget-object v0, Lcom/bestmafen/androidbase/base/BaseApplication;->iX1O1:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object v0
.end method


# virtual methods
.method public final XIi00iiXO()V
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseApplication;->IO:Ljava/util/Set;

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/base/BaseApplication;->iO(Ljava/util/Set;)V

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseApplication;->IO:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/s5;

    invoke-interface {v1, p0}, Lcom/android/mltcode/paycertificationapi/s5;->OXO1(Landroid/app/Application;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public iO(Ljava/util/Set;)V
    .locals 1
    .param p1    # Ljava/util/Set;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/android/mltcode/paycertificationapi/s5;",
            ">;)V"
        }
    .end annotation

    const-string v0, "initInitializers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onCreate()V
    .locals 0
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseApplication;->XIi00iiXO()V

    return-void
.end method
