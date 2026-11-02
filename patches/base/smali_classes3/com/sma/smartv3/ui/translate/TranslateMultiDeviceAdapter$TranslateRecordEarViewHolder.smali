.class public final Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "TranslateRecordEarViewHolder"
.end annotation


# instance fields
.field private final binding:Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->this$0:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    invoke-virtual {p2}, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->bind$lambda$0(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Landroid/view/View;)V

    return-void
.end method

.method private static final bind$lambda$0(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->access$getPlayListener$p(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;)Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->O10IXXX0X()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;->play(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final bind(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V
    .locals 4
    .param p1    # Lcom/android/mltcode/paycertificationapi/iOIXXXII0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;->tvOriginal:Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->XX0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->this$0:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->access$getShowTranslation$p(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;)Z

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->XiOIii1()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;->tvTranslated:Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->XiOIii1()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;->tvTranslated:Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;->tvTranslated:Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->O10IXXX0X()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->this$0:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->access$getShowTranslation$p(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->this$0:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->access$getPlayListener$p(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;)Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;->ivPlay:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    invoke-virtual {v0}, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->this$0:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/m06;

    invoke-direct {v2, v1, p1}, Lcom/android/mltcode/paycertificationapi/m06;-><init>(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->binding:Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    iget-object p1, p1, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;->ivPlay:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
