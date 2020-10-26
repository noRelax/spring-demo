package com.relax.www.util;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//Download by http://www.codefans.net
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * 图片增加水印功能
 * 
 */
public class ImageMarkLogoByIcon {

	/**
	 * 给图片添加水印
	 * 
	 * @param iconPath
	 *            水印图片路径
	 * @param srcImgPath
	 *            源图片路径
	 * @param tagertPath
	 *            目标图片路径
	 */
	public static void markImageByIcon(String iconPath, String srcImgPath, String tagertPath) {

		markImageByIcon(iconPath, srcImgPath, tagertPath, null);
	}

	/**
	 * 给图片添加水印，可以设置图片水印的角度
	 * 
	 * @param iconPath
	 *            水印图片路径
	 * @param srcImgPath
	 *            源图片路径
	 * @param tagertPath
	 *            目标图片路径
	 * @param degree
	 *            水印图片旋转角度
	 */
	public static void markImageByIcon(String iconPath, String srcImgPath, String tagertPath, Integer degree) {

		OutputStream os = null;

		try {
			Image srcImg = ImageIO.read(new File(srcImgPath));
			BufferedImage buffImg = new BufferedImage(srcImg.getWidth(null), srcImg.getHeight(null), BufferedImage.TYPE_INT_RGB);

			// 得到画笔对象
			Graphics2D g = buffImg.createGraphics();

			// 设置对线段锯齿状边缘处理
			g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

			g.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null), srcImg.getHeight(null), Image.SCALE_SMOOTH), 0, 0, null);

			if (null != degree) {
				// 设置水印图片旋转
				g.rotate(Math.toRadians(degree), (double) buffImg.getWidth() / 2, (double) buffImg.getHeight() / 2);
			}
			// 水印图片的路径，水印一般格式是gif，png,这种图片可以设置透明度
			ImageIcon imgIcon = new ImageIcon(iconPath);

			// 得到Image对象
			Image img = imgIcon.getImage();

			float alpha = 0.5f; // 透明度
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));

			// 表示水印图片的位置
			g.drawImage(img, 100, 100, null);

			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));

			g.dispose();

			os = new FileOutputStream(tagertPath);

			// 生成图片
			ImageIO.write(buffImg, "JPG", os);
			System.out.println("图片水印添加成功。。。");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (null != os) {
					os.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// 功能测试
	public static void main(String[] args) {

		String srcImgPath = "C:/Users/wusong/Pictures/河南师范大学.png";
		String iconPath = "C:/Users/wusong/Pictures/1465540885634076809.jpg";
		String targerPath = "C:/Users/wusong/Pictures/my1.jpg";
		String targerPath2 = "C:/Users/wusong/Pictures/my2.jpg";
		// 给图片添加水印
		ImageMarkLogoByIcon.markImageByIcon(iconPath, srcImgPath, targerPath);
		// 给图片添加水印,水印旋转-45
		ImageMarkLogoByIcon.markImageByIcon(iconPath, srcImgPath, targerPath2, 45);

	}
}
