.class public final Lcom/sma/smartv3/ui/sport/SportDetailActivity$OXO1;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/SportDetailActivity;->testUploadStrava()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/db/entity/WorkoutIndex;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity$OXO1;->IO:Lcom/sma/smartv3/db/entity/WorkoutIndex;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/db/entity/WorkoutIndex;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailActivity$OXO1;->XIi00iiXO(Lcom/sma/smartv3/db/entity/WorkoutIndex;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/db/entity/WorkoutIndex;Z)Lkotlin/Unit;
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/AppDatabase;->workoutIndexDao()Lcom/sma/smartv3/db/dao/WorkoutIndexDao;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/sma/smartv3/db/dao/WorkoutIndexDao;->insert(Lcom/sma/smartv3/db/entity/WorkoutIndex;)J

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity$OXO1;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 3

    .line 2
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const-string v1, "getApp(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity$OXO1;->IO:Lcom/sma/smartv3/db/entity/WorkoutIndex;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/rs4;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/rs4;-><init>(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V

    invoke-static {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/XXI0Xi;->XOO0ii0(Landroid/content/Context;Lcom/sma/smartv3/db/entity/WorkoutIndex;Lkotlin/jvm/functions/Function1;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailActivity$OXO1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
