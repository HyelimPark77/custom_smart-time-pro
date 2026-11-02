.class public final Lcom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity$initAdapter$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity$initAdapter$1;-><init>(Lcom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/jc<",
        "Lcom/sma/smartv3/db/entity/AIRecords;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/db/entity/AIRecords;Landroid/view/View;)V
    .locals 7

    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/AIRecords;->getTtsVoiceName()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT_AND_RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->X11iII1O1(Lcom/sma/smartv3/util/MicrosoftSDKManage;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/LeftAndRightPlayControl;IILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/db/entity/AIRecords;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity$initAdapter$1$OXO1;->IiI10X(Lcom/sma/smartv3/db/entity/AIRecords;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;I)V
    .locals 2

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "mAIRecords"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0cdc

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const v0, 0x7f0a18aa

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p3

    const v0, 0x7f0a065d

    if-lez p3, :cond_0

    const/4 p3, 0x1

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setVisible(IZ)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setVisible(IZ)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    :goto_0
    new-instance p3, Lcom/android/mltcode/paycertificationapi/XXi1i;

    invoke-direct {p3, p2}, Lcom/android/mltcode/paycertificationapi/XXi1i;-><init>(Lcom/sma/smartv3/db/entity/AIRecords;)V

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity$initAdapter$1$OXO1;->XOO0ii0(Lcom/sma/smartv3/db/entity/AIRecords;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0eca

    return v0
.end method

.method public XOO0ii0(Lcom/sma/smartv3/db/entity/AIRecords;I)Z
    .locals 1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMType()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return p2
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity$initAdapter$1$OXO1;->O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;I)V

    return-void
.end method
