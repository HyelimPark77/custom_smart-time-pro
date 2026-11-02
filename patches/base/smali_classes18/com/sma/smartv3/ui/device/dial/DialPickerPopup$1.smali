.class public final Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;-><init>(Landroid/app/Activity;Ljava/util/List;ILcom/android/mltcode/paycertificationapi/iXiIO0i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialPickerPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialPickerPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lcom/android/mltcode/paycertificationapi/iXiIO0i;

.field final synthetic $list:[Lcom/sma/smartv3/model/WatchFaceInfo;

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;[Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/android/mltcode/paycertificationapi/iXiIO0i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;",
            "[",
            "Lcom/sma/smartv3/model/WatchFaceInfo;",
            "Lcom/android/mltcode/paycertificationapi/iXiIO0i;",
            ")V"
        }
    .end annotation

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->$list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->$callback:Lcom/android/mltcode/paycertificationapi/iXiIO0i;

    const p3, 0x7f0d0ee0

    invoke-direct {p0, p1, p3, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/android/mltcode/paycertificationapi/iXiIO0i;ILcom/sma/smartv3/ui/device/dial/DialPickerPopup;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->convert$lambda$1(Lcom/android/mltcode/paycertificationapi/iXiIO0i;ILcom/sma/smartv3/ui/device/dial/DialPickerPopup;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$1(Lcom/android/mltcode/paycertificationapi/iXiIO0i;ILcom/sma/smartv3/ui/device/dial/DialPickerPopup;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0, p1}, Lcom/android/mltcode/paycertificationapi/iXiIO0i;->OXO1(I)V

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;II)V
    .locals 8

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a05fc

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const/4 v2, 0x0

    if-nez p2, :cond_0

    .line 3
    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->$list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    aget-object v2, v3, v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/WatchFaceInfo;->getPreviewPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;->XiOIii1(Landroid/widget/ImageView;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_0
    const v3, 0xf4240

    if-lt p2, v3, :cond_2

    .line 4
    new-instance v3, Ljava/io/File;

    sget-object v4, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/uz0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v4

    sget-object v5, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v5}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "_"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ".png"

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v3, v4, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 6
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    goto :goto_3

    .line 7
    :cond_1
    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->$list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    aget-object v2, v3, v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/WatchFaceInfo;->getPreviewPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;->XiOIii1(Landroid/widget/ImageView;Ljava/lang/String;)V

    goto :goto_3

    .line 8
    :cond_2
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->$list:[Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v4, v3

    :goto_0
    const/4 v5, 0x0

    if-ge v2, v4, :cond_4

    aget-object v6, v3, v2

    invoke-virtual {v6}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result v7

    if-ne v7, p2, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_5

    .line 9
    invoke-virtual {v6}, Lcom/sma/smartv3/model/WatchFaceInfo;->getPreviewPath()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_5
    move-object p2, v5

    :goto_2
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const p2, 0x7f06024d

    .line 10
    invoke-virtual {v1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 11
    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object p2

    invoke-static {p2}, Lcom/bumptech/glide/Glide;->with(Landroid/app/Activity;)Lcom/bumptech/glide/RequestManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/sma/smartv3/model/WatchFaceInfo;->getPreviewPath()Ljava/lang/String;

    move-result-object v5

    :cond_6
    invoke-virtual {p2, v5}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    new-instance v2, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1$OXO1;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1$OXO1;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {p2, v2}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    .line 12
    :goto_3
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->$callback:Lcom/android/mltcode/paycertificationapi/iXiIO0i;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I10IIOII;

    invoke-direct {v1, p2, p3, v0}, Lcom/android/mltcode/paycertificationapi/I10IIOII;-><init>(Lcom/android/mltcode/paycertificationapi/iXiIO0i;ILcom/sma/smartv3/ui/device/dial/DialPickerPopup;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;II)V

    return-void
.end method
