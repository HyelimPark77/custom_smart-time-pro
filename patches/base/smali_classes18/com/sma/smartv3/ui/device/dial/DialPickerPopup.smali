.class public final Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;
.super Lcom/android/mltcode/paycertificationapi/I0OIO1i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialPickerPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n90#2:111\n90#2:112\n1#3:113\n*S KotlinDebug\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup\n*L\n47#1:111\n49#1:112\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialPickerPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n90#2:111\n90#2:112\n1#3:113\n*S KotlinDebug\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup\n*L\n47#1:111\n49#1:112\n*E\n"
    }
.end annotation


# instance fields
.field public final I0IIOi:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;ILcom/android/mltcode/paycertificationapi/iXiIO0i;)V
    .locals 6
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/android/mltcode/paycertificationapi/iXiIO0i;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/android/mltcode/paycertificationapi/iXiIO0i;",
            ")V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ids"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;-><init>(Landroid/app/Activity;)V

    const/16 v0, 0x5f

    if-nez p3, :cond_0

    .line 2
    sget-object p3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p3

    .line 3
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WATCHFACE_LIST"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v0, [Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Lcom/sma/smartv3/model/WatchFaceInfo;

    :goto_0
    move-object v4, p3

    goto :goto_3

    .line 4
    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    .line 5
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WATCHFACE_CATEGORY"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v0, [Lcom/sma/smartv3/model/WatchFaceCategory;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    .line 6
    check-cast v0, [Lcom/sma/smartv3/model/WatchFaceCategory;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 7
    array-length v2, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lcom/sma/smartv3/model/WatchFaceCategory;->getType()I

    move-result v5

    if-ne v5, p3, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    move-object v4, v1

    :goto_2
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/sma/smartv3/model/WatchFaceCategory;->getList()[Lcom/sma/smartv3/model/WatchFaceInfo;

    move-result-object p3

    goto :goto_0

    :cond_3
    move-object v4, v1

    .line 8
    :goto_3
    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object p3

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    const v0, 0x7f0d1026

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IiI10X()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IiI10X()Landroid/widget/FrameLayout;

    move-result-object p3

    const v0, 0x7f0a09c1

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    const-string v0, "findViewById(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;->I0IIOi:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_4

    const/4 v2, 0x3

    goto :goto_4

    :cond_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    :goto_4
    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 11
    new-instance v0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;

    move-object v3, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;[Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/android/mltcode/paycertificationapi/iXiIO0i;)V

    .line 12
    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/List;ILcom/android/mltcode/paycertificationapi/iXiIO0i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;-><init>(Landroid/app/Activity;Ljava/util/List;ILcom/android/mltcode/paycertificationapi/iXiIO0i;)V

    return-void
.end method


# virtual methods
.method public final OiIIX101O()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;->I0IIOi:Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final XiOIii1(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "imageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f06024d

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/app/Activity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$OXO1;

    invoke-direct {v0, p1, p0}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$OXO1;-><init>(Landroid/widget/ImageView;Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;)V

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    return-void
.end method
