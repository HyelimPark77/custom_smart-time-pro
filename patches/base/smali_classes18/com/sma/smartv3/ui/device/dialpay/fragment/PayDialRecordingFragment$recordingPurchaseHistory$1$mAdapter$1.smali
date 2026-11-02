.class public final Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;->recordingPurchaseHistory()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPayDialRecordingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n99#2,7:211\n106#2,3:219\n79#2,7:222\n109#2:229\n99#2,7:230\n106#2,3:238\n79#2,7:241\n109#2:248\n1#3:218\n1#3:237\n*S KotlinDebug\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1\n*L\n109#1:211,7\n109#1:219,3\n109#1:222,7\n109#1:229\n112#1:230,7\n112#1:238,3\n112#1:241,7\n112#1:248\n109#1:218\n112#1:237\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPayDialRecordingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n99#2,7:211\n106#2,3:219\n79#2,7:222\n109#2:229\n99#2,7:230\n106#2,3:238\n79#2,7:241\n109#2:248\n1#3:218\n1#3:237\n*S KotlinDebug\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1\n*L\n109#1:211,7\n109#1:219,3\n109#1:222,7\n109#1:229\n112#1:230,7\n112#1:238,3\n112#1:241,7\n112#1:248\n109#1:218\n112#1:237\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;

    const p1, 0x7f0d0edb

    invoke-direct {p0, p2, p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1;->convert$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1;->convert$lambda$0$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v1, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "mArg1"

    invoke-virtual {v1, p2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "mArg2"

    const/4 v0, 0x0

    invoke-virtual {v1, p2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "mArg3"

    invoke-virtual {v1, p2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    const-class v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final convert$lambda$0$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v1, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "mArg1"

    invoke-virtual {v1, p2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "mArg2"

    const/4 v0, 0x0

    invoke-virtual {v1, p2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "mArg3"

    invoke-virtual {v1, p2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    const-class v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V
    .locals 6

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;

    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p3

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;

    .line 3
    invoke-static {p3}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p3

    const v1, 0x7f0a05fc

    invoke-virtual {p1, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {p3, v2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const p3, 0x7f0a08f9

    .line 4
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmount()F

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v5}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    new-instance v2, Lcom/android/mltcode/paycertificationapi/cp1;

    invoke-direct {v2, v0, p2}, Lcom/android/mltcode/paycertificationapi/cp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    invoke-virtual {p1, v1, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 6
    new-instance v1, Lcom/android/mltcode/paycertificationapi/dp1;

    invoke-direct {v1, v0, p2}, Lcom/android/mltcode/paycertificationapi/dp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    invoke-virtual {p1, p3, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    :cond_0
    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V

    return-void
.end method
