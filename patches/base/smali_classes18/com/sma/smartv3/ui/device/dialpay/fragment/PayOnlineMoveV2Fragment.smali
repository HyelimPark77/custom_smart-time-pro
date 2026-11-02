.class public final Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;
.super Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPayOnlineMoveV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveV2Fragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,48:1\n90#2:49\n85#2,3:50\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveV2Fragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment\n*L\n32#1:49\n25#1:50,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPayOnlineMoveV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveV2Fragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,48:1\n90#2:49\n85#2,3:50\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveV2Fragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment\n*L\n32#1:49\n25#1:50,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;-><init>()V

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;[Lcom/sma/smartv3/model/WatchFaceCategoryV2;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;->initAdapterList$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;[Lcom/sma/smartv3/model/WatchFaceCategoryV2;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initAdapterList$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;[Lcom/sma/smartv3/model/WatchFaceCategoryV2;)Lkotlin/Unit;
    .locals 4

    if-eqz p1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WATCHFACE_LIST_V2_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v1, [Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;->showList()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final showList()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WATCHFACE_LIST_V2_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v1, [Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    if-eqz v0, :cond_0

    array-length v1, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "list -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    array-length v3, v0

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getTvView()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->XOO0XX([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getTvView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->I1()V

    return-void
.end method


# virtual methods
.method public initAdapterList()V
    .locals 7

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;->showList()V

    sget-object v0, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/WatchFaceManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/appcompat/app/AppCompatActivity;

    new-instance v4, Lcom/android/mltcode/paycertificationapi/np1;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/np1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/biz/WatchFaceManager;->O00(Lcom/sma/smartv3/biz/WatchFaceManager;Ljava/lang/String;Landroidx/appcompat/app/AppCompatActivity;Landroid/view/View;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method
