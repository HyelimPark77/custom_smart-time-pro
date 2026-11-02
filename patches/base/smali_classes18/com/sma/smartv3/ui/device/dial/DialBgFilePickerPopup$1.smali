.class public final Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/android/mltcode/paycertificationapi/X11iXOOOi;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lcom/android/mltcode/paycertificationapi/X11iXOOOi;

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/android/mltcode/paycertificationapi/X11iXOOOi;Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/android/mltcode/paycertificationapi/X11iXOOOi;",
            "Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;",
            ")V"
        }
    .end annotation

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup$1;->$callback:Lcom/android/mltcode/paycertificationapi/X11iXOOOi;

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;

    const p3, 0x7f0d0ed8

    invoke-direct {p0, p1, p3, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/android/mltcode/paycertificationapi/X11iXOOOi;ILcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup$1;->convert$lambda$0(Lcom/android/mltcode/paycertificationapi/X11iXOOOi;ILcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/android/mltcode/paycertificationapi/X11iXOOOi;ILcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0, p1}, Lcom/android/mltcode/paycertificationapi/X11iXOOOi;->OXO1(I)V

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V

    return-void
.end method

.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a05fc

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 3
    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    .line 5
    :cond_0
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup$1;->$callback:Lcom/android/mltcode/paycertificationapi/X11iXOOOi;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OO0Ii0;

    invoke-direct {v1, p2, p3, v0}, Lcom/android/mltcode/paycertificationapi/OO0Ii0;-><init>(Lcom/android/mltcode/paycertificationapi/X11iXOOOi;ILcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
